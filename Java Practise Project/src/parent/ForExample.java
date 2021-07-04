package parent;

public class ForExample {

	public void testFor(int x) {
		for (int i=0;i  <= x; i++) {
			System.out.println(i);
		}
	}
	
	public void testEach(String[] x) {
		for(String a: x) {
			System.out.println(a);
		}
	}

}
