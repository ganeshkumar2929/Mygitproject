package ganesh.exercise12;

import ganesh.exercise12.ScoreCard;

public class GradeSystem {
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
	
	
			
/*5. Within the GradeSystem create a method called getFinalGrade with
Argument as Student and would return the grade which would be a string
value
Logic is:
 Final grade = if the  (lowest of the average of the scorecard) + (if
the student is a sports student then 2 * sportsPerformanceRating) > 80
then A,  >60 & < 79, then B
   >40 & < 59, then C
                                             <39, then D*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
