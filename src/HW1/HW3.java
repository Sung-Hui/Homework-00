package HW1;

//import java.util.Scanner;

public class HW3 {
//	請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形，如圖示結果：
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("請輸入：");
//		int[] array = new int[3];
//		int enterNumberCount = 0;
//		while (sc.hasNextInt()) {
//			enterNumberCount += 1;
//			int number = sc.nextInt();
//			array[enterNumberCount - 1] = number;
//			if (enterNumberCount == 3) {
//				System.out.println("輸入3個數字囉!");
//				int number1 = array[0];
//				int number2 = array[1];
//				int number3 = array[2];
//
//				if ((number1 == number2) && (number2 == number3) && (number1 == number3) && (number1 != 0)
//						&& (number2 != 0) && (number3 != 0)) {
//					System.out.println("我是正三角形");
//				} else if ((number1 == number3) && (number1 != 0) && (number2 != 0) && (number3 != 0)) {
//					System.out.println("我是等腰三角形");
//				} else if ((number1 != number2) && (number1 != number3) && (number2 != number3) && (number1 != 0)
//						&& (number2 != 0) && (number3 != 0)) {
//					System.out.println("我是其他三角形");
//				} else if ((number1 == 0) && (number2 == 0) && (number3 == 0)) {
//					System.out.println("不是三角形");
//				}
//
//				break;
//			} // if enterNumberCount end
//		} // while end
//		System.out.println("結束");
//		sc.close();
//	}
//
//}

//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：
//	public static void main(String[] args) {
//		int rn = (int)(Math.random() * 10);
//		System.out.println("開始猜數字!");
//		Scanner sc = new Scanner(System.in);
//		int gn = sc.nextInt();
//
//		while(gn != rn) {
//			if(gn > rn) {
//				System.out.println("猜錯囉，太大了!");
//			}
//			else {
//				System.out.println("猜錯囉，太小了!");
//			}
//
//			gn = sc.nextInt();
//		}
//			System.out.println("猜對囉!");
//	}
//}
//		
//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖：
//	public static void main(String[] args) {
//		int n=0;
//		int n10, n1;
//		int amount =0;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("阿文...請輸入你討厭數字？");
//		n =sc.nextInt();
//		for (n10=0; n10<=4; n10++) {
//			if (n10 == n) {
//				continue;
//			}
//			for (n1=0; n1<=9; n1++) {
//					if (n1 == n) {
//						continue;					
//					}
//					if (n1 != 0 && n10 == 0) {
//						System.out.print(n1 + " ");
//						amount = amount+1;
//					}
//					else if (n10 >0) {
//						System.out.print(n10 +""+n1 + " ");
//						amount = amount+1;
//					}
//			}
//		}
//								
//		System.out.println();
//		System.out.println("總共個數："+ amount);
//	}
//}
//透過Math類別的靜態方法random()，可以自動產生隨機的數字
//public static void main(String[] args) {
//
//	int min = 1;
//	
//	for(int i = min; i <=10; i++) {
//		int getRandomValue = (int) (Math.random()*10) + min;
//		System.out.println("幸運數字是:"+getRandomValue);
//	  
//	}
//}
}