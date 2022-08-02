class Cal{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	//Overloading과적
	//자식class도 부모method과적 가능
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2)+v3;//자기자신인 Cal의 sum method
	}
}
class Cal3 extends Cal{
	//부모가 갖지않은 method추가
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	//부모가 가진 method 재정의
	//Overriding재정의
	public int sum(int v1, int v2) {
		System.out.println("Cal3!!");
		return super.sum(v1, v2);//Cal(부모)의 sum
	}
}
public class InheritanceApp {
	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));
		System.out.println(c.sum(2, 1, 1));//입력값이 3개면서 정수인 sum찾아서 실행
		
		Cal3 c3 = new Cal3();
		System.out.println(c.sum(2, 1));
		System.out.println(c3.minus(2, 1));
		System.out.println(c3.sum(2, 1));
	
	}

}
