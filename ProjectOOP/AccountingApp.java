class Accounting{
	public double valueOfSupply;
    public static double vatRate = 0.1; //vat(부가가치세율)은 무조건 10%니깐 instance소속보다 class의 소속으로 놔두는게 낫다
    public Accounting(double valueOfSupply) {
    	this.valueOfSupply = valueOfSupply;
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    }     
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {
    public static void main(String[] args) {
    	Accounting a1 = new Accounting(10000.0);//생성자 호출 시 인자를 매개변수로 전달
    	
    	Accounting a2 = new Accounting(20000.0);
    	
    	System.out.println("Value of supply : " + a1.valueOfSupply);
    	System.out.println("Value of supply : " + a2.valueOfSupply);
    	
    	System.out.println("VAT : " + a1.getVAT());
    	System.out.println("VAT : " + a2.getVAT());

    	System.out.println("Total : " + a1.getTotal());
    	System.out.println("Total : " + a2.getTotal());
    	
    	
//    	Accounting.valueOfSupply = 10000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        System.out.println("VAT : " + Accounting.getVAT());
//        System.out.println("Total : " + Accounting.getTotal());
// 
    }
}
