package com.sonata.main;

import com.sonata.Model.Employee;
import com.sonata.impl.EmpImpl;

public class EmpExecute {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(123);
		e1.setEmpName("vaishu");
		e1.setEmpSal(100);
		EmpImpl e2 = new EmpImpl();
		System.out.println(e2.yearlySal(e1));
		System.out.println(e2.appSal(e1));
	}

}
