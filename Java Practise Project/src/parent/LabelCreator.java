package parent;

public class LabelCreator {

	public static void main(String[] args) {

		LabelPrinter LabelPrinter1 = new LabelPrinter("Pranav", "Jagadessh","Alphabets", 1 ,"Section-A" );
		LabelPrinter LabelPrinter2 = new LabelPrinter("Pranav", "Jagadessh","Rhymes", 1 ,"Section-A");
		LabelPrinter LabelPrinter3 = new LabelPrinter("Pranav", "Jagadessh","Numbers", 1 ,"Section-A" );
		LabelPrinter1.print();
		LabelPrinter2.print();
		LabelPrinter3.print();
	}

	
}
