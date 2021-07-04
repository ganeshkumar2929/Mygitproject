package ganesh.exercise10;

public class Car {
	
/*Requirement 1: 
Create a class called Car with properties
1. colour - String
2. ownerName - String
3. engine - String
4. brakes - String
5. drive - String
6. steering - String
7. gps - Boolean
8. bluetooth - Boolean*/
	
	public String colour;
	public String ownerName;
	public String engine;
	public String brakes;
	public String drive;
	public String steering;
	public Boolean gps;
	public Boolean bluetooth;
	
/*Requirement 2: 
Within the class car create a set method for each property. Like 
Ex : methdoName: setColour, argument : 1 of type String, return type : void , logic set the value of colour 
class property with that of the argument value.
Likewise create set methods for other properties.*/
	
	public void setColour(String a1) {
		colour=a1;
	}
	
	public void setOwnerName(String a2) {
		ownerName=a2;
	}
	
	public void setEngine(String a3) {
		engine=a3;
	}
	
	public void setBrakes(String a4) {
		brakes=a4;
	}
	
	public void setDrive(String a5) {
		drive=a5;
	}
	
	public void setSteering(String a6) {
		steering=a6;
	}
	
	public void setGps(Boolean a7) {
		gps=a7;
	}
	
	public void setBluetooth(Boolean a8) {
		bluetooth=a8;
	}
	}
