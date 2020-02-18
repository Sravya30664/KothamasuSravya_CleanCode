package com.epam.cleancodetask;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleCompoundIntrestTest {
	SimpleCompoundIntrest sc;
    @Before
    public void init() {
    	sc=new SimpleCompoundIntrest();
    }

	@Test
	public void simpleIntrestTest() {
	assertEquals(450.00,sc.simpleIntrest(3000, 5, 3),0);
	}
	@Test
	public void compoundIntrestTest() {
		assertEquals(6050.000000000001,sc.compoundIntrest(5000, 10, 2),0);
	}

}
