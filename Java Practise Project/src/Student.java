
public class Student {
	
/*Requirement 2: Create the following class properties
                         1. Name: studentName , Data type: String 
                         2. Name: mathsMark, Date type: Integer
                         3. Name: mathsMark, Date type: Integer
                         4. Name: englishMark, Date type: Integer
                         5. Name: tamilMark, Date type: Integer
                         6. Name: socialScieneMark, Date type: Integer*/
	
	private String studentName;
	private int mathsMark;
	private int scieneMark;
	private int englishMark;
	private int tamilMark;
	private int socialScieneMark;
	
/*Requirement 3: Create a constructor with 6 arguments with values for all class properties and 
 * set the value within the constructor*/
	
	public Student(String personName, int mathsMarks, int scieneMarks, int englishmarks, int tamilMarks, int socialScieneMarks) {
		this.studentName = personName;
		mathsMark = mathsMarks;
		scieneMark = scieneMarks;
		englishMark = englishmarks;
		tamilMark = tamilMarks;
		socialScieneMark = socialScieneMarks;
		}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getMathsMark() {
		return mathsMark;
	}
	
	public int getScienemark() {
		return scieneMark;
	}
	
	public int getEnglishMark() {
		return englishMark;
	}
	
	public int getTamilMark() {
		return tamilMark;
	}
	
	public int getSocialScieneMark() {
		return socialScieneMark;
	}
	
/*Requirement 6: Create a printGrade method in Student class to print the grade of the student
                        Name: printGrade, argument: no argument, return type: void
[hint: to determine the grade use the GradeSystem.gradeStudent method and the argument would be this identifier.]
The output print should be : <Name of the student> has been awarded <Grade computed> grade*/
	
	public void printGrade() {
		System.out.println(studentName + "has been awarded" + GradeSystem.gradeStudent(this));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
