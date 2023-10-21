package HW6;
import java.util.Scanner;
public class CalTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入x:");
		
		int x = 0;
		int y = 0;
		int enterCount = 1;
		
		while(sc.hasNextInt()) {
			int number = sc.nextInt();

			if(enterCount == 1 ) {
				System.out.println("enter x:"+number);
				x = number;
				enterCount += 1;
				System.out.println("請輸入y:");
			} else if(enterCount == 2) {
				System.out.println("enter y:"+number);
				y = number;
				
				try {
					double result = calculator.powerXY(x, y);
					int resultInt = (int)result;
					System.out.println(x+"的"+y+"次方等於"+resultInt);
				} catch (CalException e) {
					String errMsg = e.getMessage();
					System.out.println(errMsg);
				}
				
				System.out.print("結束");
				sc.close();
				break;
			}
		}
		
		

		
		
	}
}
