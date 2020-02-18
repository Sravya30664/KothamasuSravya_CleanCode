package com.epam.cleancodetask;

public class SimpleCompoundIntrest {
     public double simpleIntrest(double principle_amount,double rate_of_intrest,double time_in_years) {
    	 return principle_amount*rate_of_intrest*time_in_years/100;
     }
     public double compoundIntrest(double principle_amount,double rate_of_intrest,double time_in_years) {
    	 return principle_amount*Math.pow(1+(rate_of_intrest/100),time_in_years);
     }
}
