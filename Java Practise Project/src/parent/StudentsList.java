package parent;

public class StudentsList {
	private String name;
	private int mathsMark;
	private int scienceMark;
	private int englishMark;
	 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getMathsMark() {
		return mathsMark;
	}
	public void setMathsMark(int mathsMark) {
		this.mathsMark=mathsMark;
	}
	public int getScienceMark() {
		return scienceMark;
	}
	public void setScienceMark(int scienceMark) {
		this.scienceMark=scienceMark;
	}
	public int getEnglishMark() {
		return englishMark;
	}
	public void setEnglishMark(int englishMark) {
		this.englishMark=englishMark;
	}
	
	 public int averageMark() {
		int x =(mathsMark+scienceMark+englishMark) /3;
	  return x;
	}
	 
	 
	}









