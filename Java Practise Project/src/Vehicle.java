
public  abstract class Vehicle {
	public int speed=0;
	
	protected abstract int getStepSpeed();

	//acc method
	public void accelerate() {
		  speed =speed+getStepSpeed();
		  
	}
	
	//Brake method
	public void  breaking() {
		if(speed > 0) {
		  speed -= getStepSpeed();
	}
	}
	//Currentspeed
	public int currentSpeed() {
		return speed;
		
	}
	
}
