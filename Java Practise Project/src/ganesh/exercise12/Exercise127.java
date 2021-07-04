package ganesh.exercise12;

public class Exercise127 {
	
	public static void identifyStudent(Student[] stu) {
		for(int i=0; i<stu.length; i++) {
			if(stu[i] instanceof SportsStudent) {
				System.out.println("The element at postion"+i+"is of type SportStudent"+stu[i].studentName+((SportsStudent)stu[i]).sportsPerformanceRating);
			}else if(stu[i] instanceof Student) {
				System.out.println("The element at postion"+i+"is of type Student"+stu[i].studentName);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Requirement 10: Create a class with name Exercise 7 and create the static void main method, within the method do the following

 1. Create an instance/object of  Student with studentName called Pranav
 2. Create an instance/object of ScoreCard with exam type "Quarterly" and marks as 100,90,89,90,85

 3. Add the scorecard instance to the student [hint: using the addScoreCard method in the student class]
 4. Create an instance/object of ScoreCard with exam type "Half-Yearly" and marks as 100,80,99,94,88

 5. Add the scorecard instance created in step 4 to the student [hint: using the addScoreCard method in the student class]
 6. Create an instance/object of ScoreCard with exam type "Annual" and marks as 100,90,99,94,98

 7. Add the scorecard instance created in step 6 to the student [hint: using the addScoreCard method in the student class]

 
8. Print the grade of the student scored across in different exam [Hint: Call the printGrade method using the object created for pranav]*/
	
		Student instOfStudent = new Student("Pranav");
		ScoreCard instOfScoreCard = new ScoreCard("Quarterly", 100,90, 89, 90, 85);
		instOfStudent.addScoreCard(instOfScoreCard);
		ScoreCard instOfScoreCard1 = new ScoreCard("Half-Yearly",100,80,99,94,88);
		instOfStudent.addScoreCard(instOfScoreCard1);
		Student instOfStudent2 = new Student("Ganesh");
		ScoreCard instOfScoreCard2 = new ScoreCard("Quarterly", 100,90,89,90,85);
		instOfStudent2.addScoreCard(instOfScoreCard2);
		instOfStudent.printGrade();
		instOfStudent2.printGrade();
		SportsStudent instOfSportsStudent = new SportsStudent("Ganesh", 25);
		//instOfSportsStudent.printGrade();
		instOfSportsStudent.addScoreCard(new ScoreCard("Half-Yearly", 95,100,89,79,90));
		instOfSportsStudent.printGrade();
		Student[] students = new Student[5];
		SportsStudent[] spStudent = new SportsStudent[10];
		students[0]=instOfStudent;
		students[1]=instOfSportsStudent;
		Exercise127.identifyStudent(students);
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	


}
