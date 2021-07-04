package ganesh.exercise12;

import ganesh.exercise12.GradeSystem;
import ganesh.exercise12.ScoreCard;

public class Student {
	/*Requirement 6: Create a class with name Student and single argument constructor to populate the studentName value.*/
	public String studentName;
	ScoreCard[] reportCard = new ScoreCard[5];
	int count = 0;
	
	
	
	public Student(String studentNames) {
		studentName = studentNames;
	}
	
	
/*Requirement 7: Create the following properties
 1. Name: studentName , Data type: String
 2. Name: reportCard , Data type: Array of ScoreCard, Give it a default size of 5 while you initialise it.*/
	
/*Requirement 8: Create a method to add the score card for the student
 1. Name: addScoreCard , Argument 1 of datatype ScoreCard

The logic would be to add the value of the argument to the next position in the reportcard array property 
in student class.*/
	
	public void addScoreCard(ScoreCard sC) {
		reportCard[count] = sC;
		count = count + 1;
		}

/*Requirement 9: Create a printGrade method in Student class to print the grade of the student on different exams
 Name: printGrade, argument: no argument, return type: void
[Hint: Iterate through the reportCard array and determine the grade using the GradeSystem.gradeStudentScore 
method and then using system outprintln print the data on the output]*/
//The output print should be : <Name of the student> has been awarded a <Grade computed> grade in exam <Type of Exam>
	
	public void printGrade() {
		for(int i=0; i< reportCard.length; i++) {
			//ScoreCard ScoreCards = null;
			//String examtype = null;
			if(reportCard[i] != null) {
				System.out.println(studentName+" has been awarded a "+ GradeSystem.gradeStudentScore(reportCard[i])+"grade in exam"+reportCard[i].examType);
				
			}
			
		}
	}
	
	

}
