package HW5;
import java.util.Scanner;
public class hw1 {
	 public void starSquare(int width, int height) {

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        int width = 0;
	        int height = 0;

	        hw1 squarePrinter = new hw1();

	        Scanner sc = new Scanner(System.in);
	        System.out.print("請輸入寬與高：");
	        width = sc.nextInt();
	        height = sc.nextInt();

	        while (width <= 0 || height <= 0) {
	            System.out.print("錯誤，請輸入正整數！");
	            System.out.print("請輸入寬與高：");
	            width = sc.nextInt();
	            height = sc.nextInt();
	        }
	        squarePrinter.starSquare(width, height);
	        sc.close();
	    }
	}

