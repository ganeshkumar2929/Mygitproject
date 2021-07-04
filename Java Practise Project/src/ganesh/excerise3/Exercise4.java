package ganesh.excerise3;

public class Exercise4 {

	public static void main(String[] args) {

		
		Parcel ParcelNew = new Parcel("Pranav", 12.2);
		double finalCostOfParcel=ParcelDeliveryCostCalculator.calculateDeliveryCost(ParcelNew);
		System.out.println("Name of the Customer:"+ ParcelNew.customerName);
		System.out.println("Parcel ID:"+ParcelNew.parcelID);
		System.out.println("Weight:"+ParcelNew.weightOfParcel);
		System.out.println("Cost:"+finalCostOfParcel);
		Parcel ParcelNew1 = new Parcel("Aari", 345.2);
		double finalCostOfParcel1=ParcelDeliveryCostCalculator.calculateDeliveryCost(ParcelNew1);
		System.out.println("Name of the Customer:"+ ParcelNew1.customerName);
		System.out.println("Parcel ID:"+ParcelNew1.parcelID);
		System.out.println("Weight:"+ParcelNew1.weightOfParcel);
		System.out.println("Cost:"+finalCostOfParcel1);
	}

}
