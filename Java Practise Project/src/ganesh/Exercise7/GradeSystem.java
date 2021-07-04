package ganesh.Exercise7;

public class GradeSystem {
	
/*Requirement 4: Create a static method to compute the grade of the student scored in an exam
  Name: gradeStudentScore , Argument : 1 (of data type ScoreCard), return type: String. 
  Logic for the method will be as follows
                     if student average  [(sum of all five subjects mark) / 5] is 
                                              > 80 , then A
                                              >60 & < 79, then B
                                              >40 & < 59, then C
                                              <39, then D*/
	public static String gradeStudentScore(ScoreCard scoreCard) {
		int average = (scoreCard.englishMark+scoreCard.mathsMark+scoreCard.scienceMark+scoreCard.tamilMark+scoreCard.socialScienceMark /5);
			if(average > 80) {
				return "A";
			}else if(average > 60 && average <79) {
				return "B";
			}else if (average >40 && average <59) {
				return "C";
			}else if (average < 39) {
				return "D";
			}
		
			return "Fail";
	}
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
