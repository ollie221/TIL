
public class ArrayAPP {

	public static void main(String[] args) {
		// bbo, dayeon, youjin
		//datatype이 String인 users 만들기
//      String users = "egoing, jinhuck, youbin";
		
		//String으로 이루어진 배열 만들기
		String[] users = new String[3];
		users[0] = "bbo";
		users[1] = "dayeon";
		users[2] = "youjin";
		
		System.out.println(users[2]);
		System.out.println(users.length);
		
		int[] scores = {10, 100, 100}; // 원소, element
        System.out.println(scores[1]);
        System.out.println(scores.length);
		
		
	}

}
