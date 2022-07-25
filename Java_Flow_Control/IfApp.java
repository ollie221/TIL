
public class IfApp {

	public static void main(String[] args) {

		//조건문 안에 조건문 삽입 가능
//		System.out.println("a");
//		if(true) {
//		System.out.println(1);
//		} else {
//			if (true) {
//			System.out.println(2);
//		} else {
//		System.out.println(3);
//		}
		
//		}
		
		System.out.println("a");
        if(false) {
            System.out.println(1);
        } else if(true) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
        System.out.println("b");
		
	}
}
