package com.utils;

public class CalculateUtils {

	public float sum(float var1, float var2) {
		System.out.println("Adding values: " + var1 + " + " + var2);
		return var1 + var2;
	}
	
	public float compute(String operator, float a, float b) {
        switch (operator) {
            case "+":
                return sum(a, b);
            case "-":
                return minus(a, b);
            case "*":
                return multiply(a, b);
            case "/":
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Invalid operator.");
        }
    }
	
	public float minus(float var1, float var2) {
		System.out.println("Adding values: " + var1 + " + " + var2);
		return var1 + var2;
	}
	
	public float multiply(float var1, float var2) {
		System.out.println("Adding values: " + var1 + " + " + var2);
		return var1 + var2;
	}
	
	public float divide(float var1, float var2) {
		System.out.println("Adding values: " + var1 + " + " + var2);
		return var1 + var2;
	}

}