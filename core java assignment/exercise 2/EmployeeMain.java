package com.del;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EmployeeBo empbo = new EmployeeBo();
		EmployeeSort empsort = new EmployeeSort(0);
		System.out.println("Enter number of employees: ");
		Integer noOfEmployees=scan.nextInt();
		List<EmployeeVo> empList = new ArrayList<>();
		try {
			for(int i=0;i<noOfEmployees;i++)
			{
				System.out.println("Enter the employee id");
				int employeeid=scan.nextInt();
				System.out.println("Enter the employee name");
				String employeename=scan.next();
				System.out.println("Enter the employee's annual income");
				double employeeincome=scan.nextDouble();
				empList.add(new EmployeeVo(employeeid,employeename,employeeincome, 0));
			    empbo.CalIncomeTax(empList.get(i));
}
for(EmployeeVo employeevo :empList)
{System.out.println(employeevo);
}
Collections.sort(empList, empsort);
System.out.println("\n\n Sorted List :");
for(EmployeeVo employeevo :empList)
{System.out.println(employeevo);
}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			scan.close();
		}
}
}
	
