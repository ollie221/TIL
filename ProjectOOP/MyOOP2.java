
public class MyOOP2 {

	public static void main(String[] args) {
		print p1 = new print();
		p1.delimiter = "----";
		p1.A();
		p1.A();
		p1.B();
		p1.A();
		
		print p2 = new print();
		p2.delimiter = "****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.A();
		p2.A();

	}

}
