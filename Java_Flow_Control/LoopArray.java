
public class LoopArray {

	public static void main(String[] args) {

		/*
		 * <li>bbo</li>
		 * <li>dayeon</li>
		 * <li>youjin</li>
		 */

		String[] users = new String[3];
		users[0] = "bbo";
		users[1] = "dayeon";
		users[2] = "youjin";
		
		for(int i=0; i<users.length; i++) {
			System.out.println("<li>"+users[i]+"</li>");
		}
		}

	}


