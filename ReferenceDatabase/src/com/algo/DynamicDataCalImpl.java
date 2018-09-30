package com.algo;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.ListIterator;

import com.beans.Accrued;
import com.beans.Trade;

import net.finmath.time.daycount.DayCountConventionInterface;
import net.finmath.time.daycount.DayCountConvention_30E_360;
import net.finmath.time.daycount.DayCountConvention_ACT_360;
import net.finmath.time.daycount.DayCountConvention_ACT_365;
import net.finmath.time.daycount.DayCountConvention_ACT_ACT_AFB;

public class DynamicDataCalImpl implements DynamicDataCal {
	private DayCountConventionInterface dayCountConventionModel;
	private Double yearDays;
	
	public DynamicDataCalImpl(Integer dayCountConvention) {
		
		// TODO: Complete the remaining the switch cases
		switch(dayCountConvention) {
		/*
		case 1:
			// TODO: Put the year logic for leap year it's 366 others it's 365
			// TODO: Extend DayCountConventionInterface into a new interface and introduce yearDays calculation
			// dayCountConventionModel = new DayCountConvention_ACT_ACT_AFB();
			// yearDaysTemp = 365.0d;
			
			dayCountConventionModel = null;
			yearDays = 0.0d;
			break;
		*/
		case 2:
			dayCountConventionModel = new DayCountConvention_ACT_360();
			yearDays = 360.0d;
			break;
		case 3:
			dayCountConventionModel = new DayCountConvention_ACT_365();
			yearDays = 365.0d;
			break;
		case 4:
			dayCountConventionModel = new DayCountConvention_30E_360();
			yearDays = 360.0d;
			break;
		default:
			dayCountConventionModel = new DayCountConvention_ACT_365();
			yearDays = 365.0d;
			break;
		}
	}
	
	public java.sql.Date dateDaysAfter(java.sql.Date todaysDate, Integer days) {
		java.util.Date todaysDateUtil = new java.util.Date(todaysDate.getTime());		
		Calendar cal = Calendar.getInstance();
		cal.setTime(todaysDateUtil);
		cal.add(Calendar.DATE, days);
		
		java.sql.Date retDate = new java.sql.Date(cal.getTime().getTime());
		return retDate;
	}
	
	@Override
	public void initializeTrade(Trade trade) {
		System.out.println(trade);
		
		Date settlementDate = trade.getSettlementDate();
		ArrayList<Date> couponDates = trade.getSecDetails().getCouponDates();
		Date lastCouponDate = lastCouponDate(settlementDate, couponDates);
		trade.setLastCouponDate(lastCouponDate);
		
		Double faceValue = trade.getSecDetails().getFaceValue();
		Double couponRate = trade.getSecDetails().getCouponRate();
		ArrayList<Accrued> accrueds = new ArrayList<Accrued>();
		for(Integer i=0; i<3; ++i) {
			Date accruedDate = dateDaysAfter(settlementDate, i);
			Date lastAccruedCouponDate = lastCouponDate(accruedDate, couponDates);
			Double accruedDays = accruedDays(accruedDate, lastAccruedCouponDate);
			
			Double accruedInterest = accruedInterest(accruedDays, faceValue, couponRate);

			Accrued accrued = new Accrued(null, accruedDays, accruedInterest);
			accrueds.add(accrued);
		}
		trade.setAccrued(accrueds);
		
		Integer frequency = trade.getSecDetails().getFrequency();
		Double accruedDays = trade.getAccrued().get(0).getAccruedDays();
		Date maturityDate = trade.getSecDetails().getMaturityDate();
		Integer numCoupons = couponsLeft(settlementDate, maturityDate, couponDates);

		if(trade.getTradePrice()!=null) {
			Double price = trade.getTradePrice();
			Double tradeYield = yield(couponRate, faceValue, price, frequency, accruedDays, numCoupons);
			trade.setTradeYield(tradeYield);
		}
		else if(trade.getTradeYield()!=null) {
			Double yield = trade.getTradeYield();
			Double tradePrice = presentValue(couponRate, faceValue, yield, frequency, accruedDays, numCoupons)*100.0/faceValue;
			trade.setTradePrice(tradePrice);
		}
		else {
			// TODO: Remove sysout for performance
			System.out.println("Please provide either Trade Price or Trade Yield");
		}
		
		
		if(trade.getMarketPrice()!=null) {
			Double price = trade.getMarketPrice();
			Double marketYield = yield(couponRate, faceValue, price, frequency, accruedDays, numCoupons);
			trade.setMarketYield(marketYield);
		}
		else if(trade.getMarketYield()!=null) {
			Double yield = trade.getMarketYield();
			Double marketPrice = presentValue(couponRate, faceValue, yield, frequency, accruedDays, numCoupons)*100.0/faceValue;
			trade.setMarketPrice(marketPrice);
		}
		else {
			// TODO: Remove sysout for performance
			System.out.println("Please provide Market Price");
		}
		
		trade.setTicks(null);
		
		Double cleanPrice = trade.getTradePrice()*faceValue/100.0d;
		trade.setCleanPrice(cleanPrice);
		
		Double dirtyPrice = trade.getCleanPrice()+trade.getAccrued().get(0).getAccruedInterest();
		trade.setDirtyPrice(dirtyPrice);

		System.out.println(trade);
	}

	@Override
	public Integer couponsLeft(Date settlementDate, Date maturityDate, ArrayList<Date> couponDates) {
		// TODO: Ensure couponDates are in circular order always
		// TODO Auto-generated method stub
		// TODO: Make year same before comparing
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(settlementDate);
		Integer startYear = cal.get(Calendar.YEAR);
		cal.setTime(maturityDate);
		Integer endYear = cal.get(Calendar.YEAR);

		Integer numCoupons=0;
		for(Integer year = startYear; year<=endYear; ++year) {
			for(Date date: couponDates) {
				cal.setTime(date);
				cal.set(Calendar.YEAR, year);
				Date couponDate = new Date(cal.getTime().getTime());
				if(settlementDate.before(couponDate) && (couponDate.equals(maturityDate)||couponDate.before(maturityDate))) {
					numCoupons++;
				}
			}
		}

		return numCoupons;
	}

	@Override
	public Date lastCouponDate(Date settlementDate, ArrayList<Date> couponDates) {
		// TODO: Ensure couponDates are in circular order always
		// TODO Auto-generated method stub
		// TODO: Make year same before comparing
		// System.out.println("settle"+settlementDate);
		// System.out.println("datearray"+couponDates);
		Calendar cal = Calendar.getInstance();
		ArrayList<Date> testCouponDates = new ArrayList<Date>();
		for(Date date: couponDates) {
			cal.setTime(date);
			cal.add(Calendar.YEAR, -1);
			Date newDate = new Date(cal.getTime().getTime());
			testCouponDates.add(newDate);
		}
		for(Date date: couponDates) {
			cal.setTime(date);
			Date newDate = new Date(cal.getTime().getTime());
			testCouponDates.add(newDate);
		}
		
		// System.out.println(settlementDate);
		// System.out.println(testCouponDates);
		
		Date lastCouponDate = null;
		ListIterator<Date> itr = testCouponDates.listIterator(testCouponDates.size());		
		while(itr.hasPrevious()) {
			Date couponDate = itr.previous();
			if(couponDate.equals(settlementDate) || couponDate.before(settlementDate)) {
				lastCouponDate = couponDate;
				break;
			}
		}
		
		return lastCouponDate;
	}

	// TODO: Take day count convention as input
	@Override
	public Double accruedDays(Date settlementDate, Date lastCouponDate) {
		// TODO Auto-generated method stub
		// TODO While passing make sure the month starts from 0, fix it later inside code to follow standard convention
		// TODO Check if it's right to add Double cast

		// Double days = (Double)(double)(settlementDate.getTime()-lastCouponDate.getTime())/(24*60*60*1000);
		//System.out.println(lastCouponDate);
		//System.out.println("settle date"+settlementDate);
		Double days = dayCountConventionModel.getDaycount(lastCouponDate.toLocalDate(), settlementDate.toLocalDate());
		
		return days;
	}

	// TODO: Take day count convention as input
	@Override
	public Double accruedInterest(Double accruedDays, Double faceValue, Double couponRate) {
		// TODO Auto-generated method stub
		Double interest = (faceValue*couponRate*accruedDays)/(yearDays*100.0d); //use yeardays in place of 360
		return interest;
	}
	
	// TODO: Take day count convention as input
	@Override
	public Double presentValue(Double couponRate, Double faceValue, Double marketYield, Integer frequency, Double accruedDays, Integer numCoupons) {
		Double normalizedRate = marketYield/(frequency*100.0d);	// r/f
		Double k = 1/Math.pow((1+normalizedRate), (double)(yearDays-accruedDays*frequency)/yearDays);
		
		Double ret = faceValue*(couponRate/(100.0d*frequency))*k*(1-1.0d/Math.pow((1.0d+normalizedRate), (double)numCoupons))*(1.0d+normalizedRate)/normalizedRate;
		ret += faceValue*k/(Math.pow(1+normalizedRate, numCoupons-1));
		ret -= accruedInterest(accruedDays, faceValue, couponRate);
		return ret;
	}

	// TODO: Pass Security object instead of individual values
	// TODO: Take day count convention as input
	@Override
	public Double yield(Double couponRate, Double faceValue, Double price, Integer frequency, Double accruedDays, Integer numCoupons) {
		Double valuePrice = price*faceValue/100.0d;
		
		// TODO Auto-generated method stub
		
		/*
		NOTE: Find days left for every coupon and maturity, discount all the coupons and maturity value to todays date.
		We know the trade value and the discounted price, binary search for the interest rate.
		*/
		
		// TODO: Create a seperate case for under 1 year bonds.
		// TODO(Done): Don't use n give it proper name
		Double leftYield = 0.0d, rightYield = 100.0d, midYield = 50.0d, value;
		
		// TODO: Check the termination condition. And ensure it terminates
		while(Math.abs(rightYield-leftYield)>0.000001d)
		{
			midYield = (leftYield+rightYield)/2.0d;
			// TODO: Fix accrued days
			value = presentValue(couponRate, faceValue, midYield, frequency, accruedDays, numCoupons);
			if(value>valuePrice) {
				leftYield = midYield;
			}
			else {
				rightYield = midYield;
			}
		}
		
		return midYield;		
	}
}
