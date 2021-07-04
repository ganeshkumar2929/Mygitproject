package parent;

import java.util.ArrayList;

public class School {

	ArrayList<StudentsList> listOfStudents = new ArrayList<StudentsList>();
	
	//Enroll student method
		public void enrollStudent(StudentsList a) {
			listOfStudents.add(a);
		}
	
	//Average of student
		public int studentAverage(String nameOfTheStudent) {
			int y = 0;
			 for(int i=0; i<listOfStudents.size(); i++) {
				 if(listOfStudents.get(i).getName()==nameOfTheStudent) {
				 StudentsList x =listOfStudents.get(i);
				return x.averageMark();
				 }
					 }
			return y;
			  
			 }
				 
	//How many student scored above 90
		public int marksAbove90() {
			int x=0;
			for(int i=0; i<listOfStudents.size(); i++) {
				if(listOfStudents.get(i).averageMark()>90) {
					   x =x+1;
				}
				}
			return x;
			
		}
		
		
		public static void main(String[] args) {
			School tempSchool = new School();
			StudentsList pranav = new StudentsList();
			tempSchool.enrollStudent(pranav);
			pranav.setName("Pranav");
			pranav.setEnglishMark(85);
			pranav.setMathsMark(100);
			pranav.setScienceMark(99);
			StudentsList aari = new StudentsList();
			tempSchool.enrollStudent(aari);
			aari.setName("Aari");
			aari.setEnglishMark(100);
			aari.setMathsMark(99);
			aari.setScienceMark(100);
			StudentsList ganesh = new StudentsList();
			tempSchool.enrollStudent(ganesh);
			ganesh.setName("Ganesh");
			ganesh.setEnglishMark(56);
			ganesh.setMathsMark(76);
			ganesh.setScienceMark(50);
			System.out.println("Average of the student is"+ tempSchool.studentAverage("Pranav"));
			System.out.println("Average of the student is"+ tempSchool.studentAverage("Aari"));
			System.out.println("Average of the student is"+ tempSchool.studentAverage("Ganesh"));
			System.out.println(tempSchool.marksAbove90());
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
