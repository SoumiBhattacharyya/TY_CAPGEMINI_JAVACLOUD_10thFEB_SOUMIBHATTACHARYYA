package com.tyss.capgemini.inheritance;

public class SubClassL1 extends SuperClass {
	
//	@Override
//	public String print() {
//		return "Some other string";
//	}

	public void display() {
		System.out.println("display() of subclass");
	}
	
	
	public static void main(String[] args) {
		
		SuperClass superClass=new SuperClass();
		SubClassL1 subClassL1=new SubClassL1();
		
		SuperClass superClass2=new SubClassL1();			//Up-casting
		SubClassL1 subClassL12=(SubClassL1) superClass2; //Downcasting
		
		System.out.println(superClass.print());
		System.out.println(subClassL1.print());		//class cast exception during run time
		System.out.println(subClassL12.print());
		
		subClassL1.display();

		
	}
}
