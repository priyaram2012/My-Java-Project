package com.oops;

class parent{
	
	int phone_numbers = 3343464;
	void car() {
		System.out.println("car names");
	}
	
}
public class Inheritance extends parent {//childclass
	void phone(){
		System.out.println("phone name");
		
	}
                        

	public static void main(String[] args) {
		parent p = new parent();//created a object of a parent class
		p.car();// called the parent class method
		
		Inheritance i = new Inheritance();
		i.phone();
		p.car();

	}

}
