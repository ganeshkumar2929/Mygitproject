package ganesh.excerise3;
public class ParcelDeliveryCostCalculator {
	
	/*Requirement 6: Create a static method which would accept a parcel as argument and calculate the shipping cost 
	 * based on the logic (every 1 kg = 10$, Hence if the parcel is 2.5 kg then the shipping cost should be 25$)
	 Name of the method: calculateDeliveryCost, Arguments: 1 (name of Argument: parcel, Datatype: Parcel), 
	 Return type: Double.
	[Hint: The weight value required for calculation should be retrieved from the parcel field property]*/
		
		public static Double calculateDeliveryCost(Parcel parcel) {
			return parcel.weightOfParcel*10;
		}	

}
