package com.masai;

public class Car {
	
	String model;
	String companyName;
	String Color;
	Engine engine;

//	java bean 
	class Engine{
		int rmp;
		int Power;
		String manufacturer;
		Boolean hasTurbo;
		
		void turbo(boolean hasTurbo) {
			hasTurbo = false;
			
		}
		
	}
    class Main{
		
    	
    	//no args
    	
    	Main(){
    		this("Harrier","Tata", "black",10000,110,"Tata",true);  // call part
    	}
    	
    	Main(String model, String companyName, String Color,int rmp,int power,String manufacturer, boolean hasTurbo){
//    		System.out.println("I am parameterized const.");
    		
    		System.out.println("Car Model " + model);
    		System.out.println("Car companyName " + companyName);
    		System.out.println("Car color "+  Color);
    		System.out.println("Car RPM " + rmp );
    	   System.out.println("Car Power " + power);
    	   System.out.println("Car enigine Manufacture " +manufacturer );
    	   System.out.println("Car has Turbo " + hasTurbo);
    	}
		
	}
	
    
    Engine e1 = new Engine();
    
	public static void main(String[] args) {
		
		Car c1 = new Car();
	    
		
		c1.new Main();
	}
	
}

