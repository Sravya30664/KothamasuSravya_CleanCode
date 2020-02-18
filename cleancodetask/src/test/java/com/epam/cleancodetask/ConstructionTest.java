package com.epam.cleancodetask;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Test;
public class ConstructionTest {
	Construction c;
	@Before
	 public void init() {
    	c=new Construction();
    }


	@Test
	public void testhousecost() {
		assertEquals(264000,c.housecost("standard", 220, "no"),0);
	}
	public void testhousecost1() {
		assertEquals(495000.00,c.housecost("above standard", 330, "no"),0);
	}
	public void testhousecost2() {
		assertEquals(802800.00,c.housecost("high standard", 446, "no"),0);
	}
	public void testhousecost3() {
		assertEquals(2650000.00,c.housecost("high standard", 1060, "yes"),0);
	}
	

}
