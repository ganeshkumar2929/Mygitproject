//class with name LabelPrinter
public class LabelPrinter {
	
/*Requirement 2: Add the following properties to the label printer class 
    1. FirstName of type String
    2. LastName of type String
    3. SubjectName of type String
    4. ClassLevel of type Integer 
    5. Section of type String	*/
	
	public String FirstName;
	public String LastName;
	public String SubjectName;
	public int ClassLevel;
	public String Section;
	
//Requirement 3: Add a Constructor with arguments corresponding to the property value
	
	public LabelPrinter(String initialName, String endname, String titleName, int standardlevel,String partSection) {
		FirstName = initialName;
		LastName = endname;
		SubjectName = titleName;
		ClassLevel = standardlevel;
		Section = partSection;
		
	}
	
	/* Create the following Methods in class LabelPrinter
                                   1. create a method to update the first name and second name values (Name of the Method - updateName).
                                   2. create a method to update the SubjectName (Name of the Method - updateSubjectName)
                                   3. create a method to update the classLevel and Section (Name of the Method - updateClassAndSection)
                                   4. Create a method to print the label (Name of the method - print, Hint - It is a no argument method). The output should be printed as 
Name : <value of FirstName> <value of LastName>
Subject: <value of SubjectName>
Class: <Value of ClassLevel>  Section: <value of Section>*/
	
	public void updateName(String s1, String s2) {
		FirstName= s1;
		LastName = s2;
		
		
	}
	
	public void updateSubjectName(String s2) {
		SubjectName= s2;
		
	}
	
	public void updateClassAndSection(int s1, String s2) {
		ClassLevel = s1;
		Section 	= s2;
		
		}
	
	public void print () {
		//System.out.println(Name :"Pranav" "jagadeesh"
				
		
	}
	
//Create a class with a main method in it (ClassName: LabelCreator)
	
	public class LabelCreator{
		
		public void main(String[] a1) {
			
/*Requirement 6: Create a label for FirstName - Pranav , 
			Lastname -Jagadeesh, Subject - Alphabets , 
			Class - 1 , Section - A 
			(Hint:  create a instance of Labelprinter with the given values)*/

			LabelPrinter instanceofLabelPrinter = new LabelPrinter("Pranav", "Jagadeesh", "Alphabets", 1, "Section-A");
			instanceofLabelPrinter.print();
			
//			LabelPrinter instanceofLabelPrinter = new LabelPrinter("Pranav1", "Jagadeesh1", "Rhymes", 1, "Section-A");
//			instanceofLabelPrinter.print();
			

			
		
/*Requirement 7: Create a label for FirstName - Pranav , Lastname -Jagadeesh, 
 * Subject - Rhymes , Class - 1 , Section - A 
 * (Hint:  create a instance of Labelprinter with the given values)*/
			
 
			
			LabelPrinter instanceofLabelPrinter1 = new LabelPrinter("Pranav", "Jagadeesh", "Rhymes", 1, "Section-A");
 
 /*Create a label for FirstName - Pranav , Lastname -Jagadeesh, Subject - Numbers , 
  * Class - 1 , Section - A 
  * (Hint:  create a instance of Labelprinter with the given values)*/
 
			LabelPrinter instanceofLabelPrinter2 = new LabelPrinter("Pranav", "Jagadeesh", "Numbers", 1, "Section-A");

			
			
			
			
			
			
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
