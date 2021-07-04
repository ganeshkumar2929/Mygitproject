package parent;

public class Student {
	public String firstName;
	public String LastName;
	
	  Student(String FirstName, String LastName){
		  this.firstName= FirstName;
		  this.LastName = LastName;
		  }
	  
	  public String Greetings() {
		  return ("Welcome" + this.firstName +this.LastName);
		  }
	  
	  //receivce another input parameter as student and should compare the last name whether it is same 
	  
	  public Boolean LastNameChecking(Student anotherStudent) {
		  String lastname = anotherStudent.LastName;
		  if (this.LastName == lastname) {
			  return true;
		  }
		  return false;
	  }
}
