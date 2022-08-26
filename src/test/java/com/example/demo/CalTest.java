package com.example.demo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.Test;

import org.junit.jupiter.api.Assertions;

import com.example.demo.Calculator;

public class CalTest {
    
	 Calculator c1 = new Calculator(); 
   @Test
   public void addTest() {
	   Calculator c1 = new Calculator();
	   Assertions.assertEquals(10, c1.add(5, 5));
	   
		
	}
   @Test
   public void div1Test() {
	
	   assertThrows(ArithmeticException.class,()->c1.div1(1,0),"it is an error");
   }
	   

}
