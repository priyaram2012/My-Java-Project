package com.oops;

    class Variables {
    	int a = 10;
  	
}





public class Override extends Variables {
	
	int a = 20;

	public static void main(String[] args) {
		Variables v = new Override();
		System.out.println(v.a);
			
		 

	}

}
