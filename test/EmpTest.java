package com.sonata.test;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;



public class EmpTest {
	
	public class EmpTest {
@Test
	   public void EmpTest() {
		   Employee e3 = new Employee();
		   EmpImpl e4 = new EmpImpl();
		   e3.setEmpSal(100);
		   Assertions.assertEquals(1500, e4.yearlySal(e3));
		   
	   }
	}
}
