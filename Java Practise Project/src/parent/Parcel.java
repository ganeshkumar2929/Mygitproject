package parent;

public class Parcel {
	
	String customerName;
	Integer contactNumber;
	double weightOfParcel;
	Integer parcelID;
	static int count =0;
	
public Parcel(String customerName, double weightOfParcel) {
	this.customerName=customerName;
	this.weightOfParcel=weightOfParcel;
	
	count = count +1;
	parcelID=count;
}

public void updatePhoneNumber(Integer phoneNumber) {
	this.contactNumber = phoneNumber;
}


}
