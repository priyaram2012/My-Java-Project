package com.oops;

	class Test{
		//if a class has multiple methods with the same name with different parameters
		//we can say that is a overloading
		//when overloading happens: it happens on compilation level
	void demo(int a) {
		System.out.println("display demo with a");
	}
	
	void demo(int a,int b) {
		System.out.println("display demo with a,b");
	}
	void display() {
		
		System.out.println("display123");
	}

	} 
	
	
	public class Polymorphism {	

	public static void main(String[] args) {
		Test t= new Test();
		t.demo(10);
		t.demo(10,20);
		
		

	}

}

