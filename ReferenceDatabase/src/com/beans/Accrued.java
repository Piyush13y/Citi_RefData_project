package com.beans;

import java.util.List;

public class Accrued {
	private Integer AccId;
	private Double AccruedDays;
	private Double AccruedInterest;
	
	public Accrued() {
		super();
	}

	public Accrued(Integer accId, Double accruedDays, Double accruedInterest) {
		super();
		AccId = accId;
		AccruedDays = accruedDays;
		AccruedInterest = accruedInterest;
	}

	public Double getAccruedDays() {
		return AccruedDays;
	}

	public void setAccruedDays(Double accruedDays) {
		AccruedDays = accruedDays;
	}


	public Double getAccruedInterest() {
		return AccruedInterest;
	}

	public void setAccruedInterest(Double accruedInterest) {
		AccruedInterest = accruedInterest;
	}

	@Override
	public String toString() {
		return "Accrued [AccId=" + AccId + ", AccruedDays=" + AccruedDays + ", AccruedInterest=" + AccruedInterest
				+ "]";
	}
}
