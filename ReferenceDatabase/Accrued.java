package com.beans;

import java.util.List;

public class Accrued {
	private Integer accruedDays;
	private Float accruedInterest;
	public Integer getAccruedDays() {
		return accruedDays;
	}
	
	
	public Accrued(Integer accruedDays, Float accruedInterest) {
		super();
		this.accruedDays = accruedDays;
		this.accruedInterest = accruedInterest;
	}


	public void setAccruedDays(Integer accruedDays) {
		this.accruedDays = accruedDays;
	}
	public Float getAccruedInterest() {
		return accruedInterest;
	}
	public void setAccruedInterest(Float accruedInterest) {
		this.accruedInterest = accruedInterest;
	}
	
}
