package ganesh.Exercise7;

public class ScoreCard {
	
/*Requirement 2: Create the following properties
                         1. Name: examType , Data type: String 
                         2. Name: mathsMark, Date type: Integer
                         3. Name: scienceMark, Date type: Integer
                         4. Name: englishMark, Date type: Integer
                         5. Name: tamilMark, Date type: Integer
                         6. Name: socialScieneMark, Date type: Integer*/
	public String examType;
	public int mathsMark;
	public int scienceMark;
	public int englishMark;
	public int tamilMark;
	public int socialScienceMark;
	
	/*Requirement 5: Create a constructor with 6 arguments with values for all class properties and 
	 * set the value within the constructor*/
	
	public ScoreCard(String examTypes, int englishMarks, int mathsMarks, int scienceMarks, int tamilMarks, int socialScienceMarks) {
		examType = examTypes;
		mathsMark = mathsMarks;
		scienceMark = scienceMarks;
		tamilMark = tamilMarks;
		socialScienceMark = socialScienceMarks;
		englishMark = englishMarks;
	}
	

}
