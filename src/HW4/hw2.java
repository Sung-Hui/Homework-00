package HW4;

	import java.util.*;

	public class hw2 {

		public static void main(String[]args) {
			System.out.println("請輸入文字");
			Scanner words = new Scanner(System.in);
			StringBuilder wow = new StringBuilder(words.next());
			System.out.println("反轉後:"+wow.reverse());
		}
	}

