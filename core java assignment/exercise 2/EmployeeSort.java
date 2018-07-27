package com.del;

import java.util.Comparator;

public class EmployeeSort implements Comparator<EmployeeVo> {

	private double incometax;

	public EmployeeSort(double incometax) {
		this.incometax=incometax;
	}
	@Override
	public int compare(EmployeeVo e1, EmployeeVo e2) {
		return (int) (e1.getIncometax()-e2.getIncometax());
	}

	

}
