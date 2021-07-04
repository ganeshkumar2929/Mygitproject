package ganesh.excerise3;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Requirement 7: Create a class called Exercise3 and have a static void main method in it. 
		 * This class will be used as an entry point to test the other classes
		 Within the method:
		 1. Create an instance of a parcel using the constructor (with the following values as arguments [parcel1,12.2])
2. Using the calculateDeliveryCost in the ParcelDeliveryCostCalculator compute the delivery cost for the parcel. 
		 And the store the computed cost in a variable
		 3. Using system out println print the computed cost in the bellow format
		 Parcel ID: <ID of the parcel> , Weight: <Weight of the parcel>, 
		 Cost: <Computed cost variable created in the previous step>*/
		
		Parcel instanceOfParcel = new Parcel("parcel1", 12.2);
		ParcelDeliveryCostCalculator.calculateDeliveryCost(instanceOfParcel);
		}

}
