
public class GradeSystem {
	
/*Requirement 5: Create a static method to compute the grade of the student
 Name: gradeStudent , Argument : 1 (of data type Student), return type: String. Logic for the method will be as follows
              if student average  [(sum of all five subjects mark) / 5] is 
                                              > 80 , then A
                                              >60 & < 79, then B
                                              >40 & < 59, then C
                                              <39, then D*/
	public static String gradeStudent(Student students) {
		int average = (students.getMathsMark() + students.getScienemark() + students.getTamilMark() + students.getEnglishMark() + students.getTamilMark()) /5;
		//int average1 = (students.mathsMark+ students.scieneMark + students.tamilMark + students.englishMark + students.tamilMark) /5;
		if (average > 80) {
			return "A";
		}else if (average > 60 && average <79) {
			return "B";
		}else if (average > 40 && average <59) {
			return "C";
		}else if (average < 39){
			return "D";
		}
		return "fail";
		
		
		
	}
	

}
