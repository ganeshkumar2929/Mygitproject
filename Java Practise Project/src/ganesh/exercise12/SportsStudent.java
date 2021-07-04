package ganesh.exercise12;

//import ganesh.Exercise7.GradeSystem;

public class SportsStudent extends Student{
	
/*4. Create a property called sportsPerformanceRating within
SportStudent to have a numeric value to rate the students performance
in sports [Create necessary constructors to populate data]*/
	
	public Integer sportsPerformanceRating;
	
	
	
	public void printGrade() {
		System.out.println(studentName+" has scored a Sportsrating of "+sportsPerformanceRating);
		super.printGrade();
	}
	
	public SportsStudent(String name, Integer performanceInSports) {
		super(name);
		sportsPerformanceRating = performanceInSports;
	}
	
	
	

}
