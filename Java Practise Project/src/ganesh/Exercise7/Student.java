package ganesh.Exercise7;

public class Student {
	
/*Requirement 6: Create a class with name Student and single argument constructor to populate the studentName value.*/
	public String studentName;
	ScoreCard[] reportCard = new ScoreCard[5];
	int count = 0;
	
	
	
	public Student(String studentNames) {
		studentName = studentNames;
	}
	

	
	public void addScoreCard(ScoreCard sC) {
		reportCard[count] = sC;
		count = count + 1;
		}


	
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
