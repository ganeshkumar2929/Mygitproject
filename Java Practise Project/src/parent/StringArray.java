package parent;





public class StringArray {
	 static void NamesInserting(String a[]) {
		 for(String i :a) {
			 System.out.println(i);
		 }
	 }

	 
	 
	 
	 public static void main(String[] args) {
		 String a[] = {"jack","pranav","aari"};
		 StringArray.NamesInserting(a);
	 }
}
