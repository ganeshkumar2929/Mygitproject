package scoreCard;


public class Student {
	
	String studentName;
	ScoreCard [] reportCard = new ScoreCard[5];
	public Student(String studentName) {
		this.studentName=studentName;
	}
		int count=0;
		
		public void addScoreCard (ScoreCard ScoreCards) {
			reportCard[count]=ScoreCards;
			count =count +1;
		}
		
		public void printGrade() {
			for(int i=0; i<reportCard.length; i++) {
				if(reportCard[i] != null) {
System.out.println(studentName+" has been awarded a "+ GradeSystem.gradeStudentScore(reportCard[i])+"grade in exam"+reportCard[i].examType);	
			}
		}
		
	}

}




