package ganesh.exercise10;

public class TiagoFactory {
	
/*Requirement 4: 
Within the tiagoFactory,
Create a method to return the driveMode , 
Name: getDriveMode , Return type: String, Arguments : 0
Logic:  return "2WD";

Create a method to return the engine , 
Name: getEngine , Return type: String, Arguments : 0
Logic:  return "1.3lt";

Create a method to return the brakeType , 
Name: getBrakeType , Return type: String, Arguments : 0
Logic:  return "ABS";

Create a method to return the steering , 
Name: getSteering , Return type: String, Arguments : 0
Logic:  return "Manual";

Create a method to return the bluetooth , 
Name: getBluetooth , Return type: Boolean, Arguments : 0
Logic:  return true;

Create a method to return the gps , 
Name: getGps, Return type: Boolean, Arguments : 0
Logic:  return false;*/
	
	public String getDriveMode() {
		return "2WD";
	}
	
	public String getEngine() {
		return "1.3LT";
	}
	
	public String getBrakeType() {
		return "ABS";
	}
	
	public String getSteering() {
		return "Manual";
	}
	
	public Boolean getBluetooth() {
		return true;
	}
	
	public Boolean getGps() {
		return false;
	}
	
/*Requirement 5:
Within the Tiago factory create a method called createCar to create instances of car
method Name : createCar, return type : instance of car, arguments : 2, String ownerName and String colour
Logic: 
Create an instance of the car
then,On the car instance Invoke the setColour and setOwnerName methods by sending the appropriate arguments.
then,On the car instance Invoke the other methods like setEngine and the argument for this method will be from the 
getEngine method in the factory.  [Hint will be sent on request]
Similarly invoke other methods to set other properties.*/

	
	public Car createCar(String OwnerName, String colour) {
		Car Car1 = new Car();
		Car1.setColour(colour);
		Car1.setOwnerName(OwnerName);
		Car1.setEngine(getEngine());
		Car1.setBrakes(getBrakeType());
		Car1.setDrive(getDriveMode());
		Car1.setSteering(getSteering());
		Car1.setGps(getGps());
		Car1.setBluetooth(getBluetooth());
		return Car1;
		
	}
	}
