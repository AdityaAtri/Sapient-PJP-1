package com.sapient.week1;
//here we are going to import some packages that need to install
//mvn clean install
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Test;


public class CheckEvenTest { 
	private CheckEven app;

	@Before
	public void setup(){
		app = new CheckEven();
	}

	@Test
	public void test_zero(){
		boolean answer = app.check(0);
		assertTrue(answer == true);
	}

	@Test
	public void test_odd(){
		boolean answer = app.check(13);
		assertTrue(answer == false);
	}

	@Test
	public void test_even(){
		boolean answer = app.check(4);
		assertTrue(answer == true);
	}

}
