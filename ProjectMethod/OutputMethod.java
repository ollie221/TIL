
public class OutputMethod {
	public static String a() {
		//...
		return "a";
	}
	public static int one() {//method는 return값이 어떤 데이터타입인지 정의해야한다
		return 1; //return 그 method를 종료시키는 역할
		//method의 return 뒤에 값이 method의 실행 결과가 됨
	}
	
	public static void main(String[] args) { //void=return값이 없다
		
		System.out.println(a());
		System.out.println(one());
	}
}
