package com.del;

public class EmployeeBo {
void CalIncomeTax(EmployeeVo e) {
	double annualincome=e.getAnnualincome();
	double tax=0;
	if ( annualincome>200000 && annualincome<=500000)
		tax=(0.05*annualincome);
	else if ( annualincome>500000 && annualincome<=2000000)
		tax=(0.1*annualincome);
	else if ( annualincome>2000000 && annualincome<=5000000)
	tax=(0.2*annualincome);
	else if ( annualincome>5000000)
		tax=(0.4*annualincome);
	e.setIncometax(tax);
}
}
