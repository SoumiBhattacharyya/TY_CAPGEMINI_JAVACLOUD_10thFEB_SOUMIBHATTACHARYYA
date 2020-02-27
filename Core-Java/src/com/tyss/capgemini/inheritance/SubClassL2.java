package com.tyss.capgemini.inheritance;

public class SubClassL2 extends SubClassL1 {
	@Override
	public void display() {

		super.display(); // it implies that if we are not writing our own implementation in the
		System.out.println("over ridden display() method in subclass2"); // overridden methods then it will implement
																			// the same output of the parent
		// class.
	}

	@Override
	public String print() {
		System.out.println("Overridden print() of SuperClass in subclass2");
		super.i=12;	
		return super.print();

	}

	

	public static void main(String[] args) {

		SubClassL2 subClassL2 = new SubClassL2();
		subClassL2.display();
		System.out.println(subClassL2.print());
		
		System.out.println("Integer i of super class : " +subClassL2.i);
		
	}
}

//super cannot be used with a static keyword and we have to write super within a method.
