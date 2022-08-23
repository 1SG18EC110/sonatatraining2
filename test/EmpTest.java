package com.sonata.test;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.sonata.Model.Employee;
import com.sonata.impl.EmpImpl;


public class EmpTest {
	@Test
	
	   public void EmpTest() {
		   Employee e3 = new Employee();
		   EmpImpl e4 = new EmpImpl();
		   e3.setEmpSal(100);
		   Assertions.assertEquals(1200, e4.yearlySal(e3));
		   
	   }
@Test
public void EmpTest1() {
	   Employee e3 = new Employee();
	   EmpImpl e4 = new EmpImpl();
	   e3.setEmpSal(100);
	   Assertions.assertEquals(1000, e4.yearlySal(e3));
	   	
	
	
	}
	
	
}
