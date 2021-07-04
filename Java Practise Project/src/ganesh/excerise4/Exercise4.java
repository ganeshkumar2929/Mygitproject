package ganesh.excerise4;
import GradeSystem;
import Student;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Requirement 7: Create a class with name Exercise 4 which would be the entry point, within the main method do the following
 1. create an instance of student with name "Pranav" and marks "100","90","90","80","85" for subjects 
 (maths, science, english, tamil and social science respectively)
 2. Print the grade of pranav [Hint use the printGrade method of the object student]
  Expected Output : Pranav has been awarded A grade*/
		
		Student Pranav = new Student("Pranav", 100,90, 90, 80,85);
		Pranav.printGrade();
		
/*Requirement 8: Create a class with name Exercise 4 which would be the entry point, within the main method do the following
 1. create an instance of student with name "Pranav" and marks "100","90","90","80","85" for subjects (maths, science, english, tamil and social science respectively)
 2. Print the grade of pranav [Hint use the grade student method in the class GradeSystem and 
 print it out from the main method using systemout statement]
             Expected Output : Pranav has been awarded A grade*/
		
		
		
		Student Pranav1 = new Student("Pranav1",100,90,90,80,85);
		
		System.out.println(Pranav1.getStudentName()+" has been awarded "+GradeSystem.gradeStudent(Pranav1)+" Grade");
		
		
		


	}

}
