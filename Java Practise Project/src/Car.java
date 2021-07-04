//four properties no of wheels, no of airbags,fueltype,nameof the car
public class Car {

	public int noOfWheels;
	public int noOfAirbags;
	public String fuelType;
	public String nameOfCar;
	
	
//create a construtor with four arugments to set default values for the properties 
	public Car (int noOfTyres, int noOfSafetybags, String gasType, String carName ) {
		noOfWheels = noOfTyres;
		noOfAirbags = noOfSafetybags;
		fuelType = gasType;
		nameOfCar = carName;
		
	}

public Car() {
	// TODO Auto-generated constructor stub
}

//create 4methods
//return no of wheels,noofairbags,fueltype,nameofcar
	
	public int getNoOfWheels() {
		return noOfWheels;
		}
	
	public int getNoOfAirbags() {
		return noOfAirbags;
		
	}
	public String getFuelType() {
		return fuelType;
		
	}
	public String getNameOfCar() {
		return nameOfCar;
		
	}

//method to set the name of car
	public void setNameOfCar(String S1) {
		nameOfCar = S1;
		}
	
//method to update the value of fule type 
	public void setFuelType(String S2) {
		fuelType = S2;
	
	}
	
	
	
	public static void main(String[] a1) {
		Car instanceOfCar = new Car(4, 6, "disel", "Vento");
		Car instanceOfCar1 = new Car();
		
		System.out.println(instanceOfCar.noOfWheels);
		System.out.println(instanceOfCar.fuelType);
		System.out.println(instanceOfCar.nameOfCar);
		System.out.println(instanceOfCar.noOfAirbags);
		
		System.out.println(instanceOfCar1.noOfWheels);
		System.out.println(instanceOfCar1.fuelType);
		System.out.println(instanceOfCar1.nameOfCar);
		System.out.println(instanceOfCar1.noOfAirbags);
	
		instanceOfCar1.setNameOfCar("Inoova");
		System.out.println(instanceOfCar1.getNameOfCar());
		
		
		
		
		instanceOfCar1.setFuelType("petrol");
		
		
		
		
		
		System.out.println(instanceOfCar.getNoOfWheels());
		System.out.println(instanceOfCar.getNoOfAirbags());
		System.out.println(instanceOfCar.getFuelType());
		System.out.println(instanceOfCar.getNameOfCar());
		
	

		
		
	}
}
