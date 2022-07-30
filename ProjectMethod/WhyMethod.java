
public class WhyMethod {
//[]배열;서로 연관된 문자열을 grouping하는 문자열 배열
//args;main이라는 method를 자바가 실행할 때 입력해주는 입력값이 들어오는 곳
	public static void main(String[] args) {
		
					// 인자, argument
		printTwoTimes("a","-");//-aa
		System.out.println (twoTimes("a", "-"));
		// 100000000
		printTwoTimes("a","*");//*aa
		// 100000000
		printTwoTimes("a","&");//&aa
		printTwoTimes("b","!");//!bb
	}
	public static String twoTimes(String text, String delimiter) {
		String out ="";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}	
//printTwoTimes라는 method를 정의
//이 method의 괄호 안 첫번째 값은 반드시 String
//이렇게 들어온 값은 중괄호 안에서 text라는 이름의 변수의 값이 되겠구나
											//매개변수,parameter
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);

	}

}
