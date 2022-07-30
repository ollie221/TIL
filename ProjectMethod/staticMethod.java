class Print {
	public String delimiter;
	public void a() { //static x = a()라는 method는 class소속x so Print.a();불가
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
		
		}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
			
		}
	public static void  c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
			
		}
}
public class staticMethod {
	
	public static void main(String[] args) {
//		Print.a("-");//<=각각의 method마다 구분자를 등록해줘야함
//		Print.b("-");
		
		Print t1 = new Print();//new=복제, t1은  Print라는 class의 분신
		t1.delimiter = "-";//t1이라는 Print의 분신은 내부적으로 delimiter값이 -가 됨
		t1.a();//t1이 가진 a method를 호출할 때 더이상 구분자를 추가하지 않아도 -가 출력됨
		t1.b();
		Print.c("&");
		
//		Print.a("*"); //a()는 Print인 class의 소속으로 실행
//		Print.b("*"); 
		
		//instance(Print의 instance t2)
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();//a()는 t2의 instance의 소속으로 실행
		t2.b();
		
	}	
}
