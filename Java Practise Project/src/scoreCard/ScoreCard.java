package scoreCard;

public  class ScoreCard {
	
	String examType;
	Integer mathsMark;
	Integer scienceMark;
	Integer englishMark;
	Integer tamilMark;
	Integer socialScienceMark;

public ScoreCard(String examType, Integer mathsmark, Integer scienceMark, Integer englishMark, Integer tamilMark, Integer socialScienceMark) {
	this.examType=examType;
	this.englishMark=englishMark;
	this.scienceMark=scienceMark;
	this.tamilMark=tamilMark;
	this.mathsMark= mathsMark;
	this.socialScienceMark=socialScienceMark;
}
}
