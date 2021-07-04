import object.Cat;
import object.Lion;
import object.Pig;

public class Main {

	public static void main(String[] args) {
		Cat myCat= new Cat();
		Pig myPig= new Pig();
		Lion myLion = new Lion();
		
			String catsound = myCat.Kathuradhu();
			System.out.println(catsound);
			String catSleepSound= myCat.sleeping();
			System.out.println(catSleepSound);
			

	}

}
