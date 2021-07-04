package scoreCard;

public class GradeSystem {

	
	
	public static String gradeStudentScore(ScoreCard studentScore) {
		int average=(studentScore.englishMark+studentScore.mathsMark+studentScore.scienceMark+studentScore.socialScienceMark+studentScore.tamilMark) /5;
		if(average > 80) {
			return "A";
		}else if(average >60 && average < 79) {
			return "B";
		}else if(average >40 && average < 59) {
			return "C";
		}else {
			return "D";
		}
		
	}
}

