package ganesh.excerise3;
public class Parcel {
	
/*Requirement 2: Create the following class properties 
 1. Name : customerName, Data type: String, Description: Used to store the reference of the customer
 2. Name : contactNumber, Data type: String, Description: Used to store the contact number of the customer
 3. Name: weightOfParcel , Data type: Double, Description: Used to hold the weight of the parcel
 4. Name: parcelID, Data type: Integer , Description: Parcel ID for KPN reference 
 (Something link order number which you get when placing order through flipkart or amazon)*/
	
	public String customerName;
	public String contactNumber;
	public Double weightOfParcel;
	public int parcelID;
	public static int count=0;
	
	
/*Requirement 3: Create a constructor with two arguments Name and weightofParcel and assign the value of the arguments 
 * to customerName and weightOfParcel class properties
Also, Within the constructor assign a value for parcelID, the value should be a different for each parcel. 
[Hint, You could use a static integer field and keep incrementing the value on each call to the constructor. 
Assign the integer value to the parcelID]*/
	
	public Parcel (String Name, Double parcelWeight){
		customerName = Name;
		weightOfParcel = parcelWeight;
		count = count + 1;
		parcelID = count;
		}
	
/*Requirement 4: Create a method to update the phone number class property with 
 * that of the value passed in the argument. 
 Name of the method: updatePhoneNumber, Arguments: 1 (name of Argument: phNo, Datatype: String), Return type: void.*/

	public void updatePhoneNumber(String telephoneNumber) {
		contactNumber = telephoneNumber;
		}
}
