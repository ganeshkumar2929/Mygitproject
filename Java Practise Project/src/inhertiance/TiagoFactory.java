package inhertiance;

public class TiagoFactory {

	
	public String getDriveMode() {
		return "2WD";
	}
	public String getEngine() {
		return "1.3lt";
	}
	public String getBrakeType() {
		return "ABS";
	}
	public String getSteering() {
		return "Manual";
	}
	public boolean getBluetooth() {
		return true;
	}
	public boolean getGps() {
		return false;
	}
	
	
	public Car createCar(String ownerName, String colour) {
		Car car1 = new Car();
		car1.setColour(colour);
		car1.setOwnerName(ownerName);
		car1.setEngine(getEngine());
		car1.setSteering(getSteering());
		car1.setBrakes(getBrakeType());
		car1.setDrive(getDriveMode());
		car1.setBluetooth(getBluetooth());
		car1.setGps(getGps());
		return car1;
	}
	
	}
