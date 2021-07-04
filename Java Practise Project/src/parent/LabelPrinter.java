package parent;

public class LabelPrinter {
	
    String firstName;
	String lastName;
	String subjectName;
	Integer classLevel;
	String section;
	
	//Add a Constructor with arguments corresponding to the property value
public LabelPrinter(String firstName, String lastName, String subjectName, Integer classLevel, String section) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.subjectName= subjectName;
	this.classLevel = classLevel;
	this.section = section;
}

public void updateName(String fName, String lName) {
	this.firstName = fName;
	this.lastName = lName;
}

public void updateSubjectName(String subName) {
	this.subjectName= subName;
}

public void updateClassAndSection(Integer classLevel, String section) {
	this.classLevel=classLevel;
	this.section=section;
}

public void print() {
	System.out.println("Name:" +firstName +lastName);
	System.out.println("Subject:" +subjectName);
	System.out.println("Class:" +classLevel + ":" +section);
}
}
