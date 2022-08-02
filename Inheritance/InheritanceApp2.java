class Cals{
	int v1, v2;
	Cals(int v1, int v2){
		System.out.println("Cals init!!");
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() {return this.v1+v2;}
}
class Cals3 extends Cals{

	Cals3(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cals3 init!!");
	
	}
	public int minus() {return this.v1-v2;}
	
}
public class InheritanceApp2 {

	public static void main(String[] args) {
		Cals cs = new Cals(2,1);
		Cals3 cs3 = new Cals3(2,1);	
		System.out.println(cs3.sum());
		System.out.println(cs3.minus());
		
	}
}
