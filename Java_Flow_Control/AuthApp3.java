
public class AuthApp3 {

	public static void main(String[] args) {

		//String[] users = {"bbo", "dayeon", "youjin"};
		String[][] users = {
				{"bbo", "1111"},
				{"dayeon", "2222"},
				{"youjin", "3333"}
		};
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		for(int i=0; i<users.length; i++) {
			String[] current = users[i];
			if(
					current[0].equals(inputId) &&
					current[1].equals(inputPass)
			) {
				isLogined = true;//플래그변수
				break;//break = break가 속해있는 반복문 종료 (vs continue)
				}
			}
		System.out.println("Hi,");
		if(isLogined) {
			System.out.println("Master!!");
		}else {
			System.out.println("Who are you?");
		}
		}

	}
