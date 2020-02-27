package com.tyss.capgemini.methods;

public class MethodCallingClass {
	public static void main(String[] args) {
		
		AreaCalculator areaCalculator=new AreaCalculator();
		
		System.out.println("Area of Square :"+areaCalculator.calculateSquareArea(7));
		System.out.println("Area of Rectangle : "+areaCalculator.calculateRectangeArea(17, 5));
		System.out.println("Area of Circle :"+areaCalculator.calculateCircleArea(5));
	}

}
