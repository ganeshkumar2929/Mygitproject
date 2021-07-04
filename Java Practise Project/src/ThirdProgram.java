
public class ThirdProgram {
	
	
//syntax for property
	public int noofwheels = 4;
	public String recentcar = "Vento";
	public Boolean iscarhaveairbags = true;
	public String nameofcarsathome ="Vento,indica";
	public String fuelType = "Disel";
	
	
	
	
//systax for method
	//<scope><return type of method><name of method>(type of arug, name of arug){
	
	public int addtionoftwonumbers(int n1, int n2) {
		int result = n1 +n2;
		return result;
		}
	
	public String totalcarathome() {
		return nameofcarsathome;               
		
	}
	
	public String mostrecentcar() {
		return recentcar;
		
	}
	
	
	
//method to update the recent car in our family
	public void jackscar(String newcar) {
		recentcar = newcar;
		
	}

	//method to find out the given car is diesel or petrol
	public String fuelofthecar () {
		return nameofcarsathome ;
		
	}
	
	//method which will return true if the fuel type is petrol 
	
	public boolean isPetrolCar(){
		if (fuelType == "Disel") {
			return false;
		}
			else {
				return true;
				
			}
		
		
		
	}
	
}
