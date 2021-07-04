package parent;

public class Main {

	public static void main(String[] args) {
		ForExample myForExample = new ForExample();
		While     myWhile 		= new While();
		DoWhile   myDoWhile     = new DoWhile();
		Continue myContinue     = new Continue();
		
		
		myForExample.testFor(5);
		myForExample.testEach(new String[] {"Jack","Shan","Ganesh"});
		myWhile.testWhile(4);
		myDoWhile.testWhile(1);
		myContinue.testContinue(10);
		Student ganeshObj = new Student("Ganesh","Kumar");
		Student jagadeeshObj = new Student("jagadeesh","shanmugam");
		ganeshObj.LastNameChecking(jagadeeshObj);
		ganeshObj.Greetings();
		
	}

}
