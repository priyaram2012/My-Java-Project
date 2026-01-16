package com.oops;

class Vehicle{
	void run() {
		System.out.println("vehicle for overridding");
	}
}


public class Overridding extends Vehicle{
	
	void run() {
		System.out.println("vehicle for overridding in override class");
	}

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();// object for parent class $              
		v.run();
		
		Overridding O = new Overridding(); //child to child works
		O.run();
		
		//we are creating the object for parent class and accessing the child class
		Vehicle v1 = new Overridding();//parent to child works
		v1.run();
		//we are creating the object for child class and accessing the parent class
		
		//Overridding O1 = new Vehicle();child to parent doesn't work
		//O1.run();
	}

}
