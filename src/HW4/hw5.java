package HW4;
import java.util.*;
public class hw5 {
	 public static void main(String[] args) {
	        int yyyy = 0, mm = 0, dd = 0;

	        int[] calendar = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	        Scanner sc = new Scanner(System.in);
	        System.out.println("請輸入年：");
	        yyyy = sc.nextInt();
	        while (yyyy < 0) {
	            System.out.println("錯誤，請輸入1以上：");
	            yyyy = sc.nextInt();
	        }
	        System.out.println("請輸入月：");
	        mm = sc.nextInt();
	        while (mm < 1 || mm > 12) {
	            System.out.println("錯誤，請輸入1~12：");
	            mm = sc.nextInt();
	        }
	        System.out.println("請輸入日：");
	        dd = sc.nextInt();

	        boolean ifLeapYear = yyyy % 400 == 0 || (yyyy % 4 == 0 && yyyy % 100 != 0);
	        if (ifLeapYear)
	            calendar[1]++;

	        while (dd < 1 || dd > calendar[mm - 1]) {
	            System.out.println("錯誤，請輸入正確日數：");
	            dd = sc.nextInt();
	        }
	        
	        int days = dd; // 先算日
	        for (int i = 0; i < mm - 1; i++) {
	            days += calendar[i]; // 加上前一個月的天數
	        }
	        System.out.println("輸入的日期為該年第" + days + "天");
	    }

	}
