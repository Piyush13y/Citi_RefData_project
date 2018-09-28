package com.daos;

import java.util.List;

import com.beans.Accrued;

public interface AccruedDAO {
	int addAccrued(List<Accrued> list, int tradeId);
	List<Accrued> findAccruedByTradeId(int tradeId);
}
