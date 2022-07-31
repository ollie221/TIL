class print {
	public String delimiter = "";
	public void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
public class MyOOP {
	
	public static void main(String[] args) {
		print.delimiter = "----";
		print.A();
		print.A();
		print.B();
		print.B();
		
		print.delimiter = "****";
		print.A();
		print.A();
		print.B();
		print.B();		
	}

}
