package HW10;

import java.util.Random;

public class hw10 {
	public static void main(String[] args) {
		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			int randomNumber = random.nextInt(100) + 1;
			System.out.println("隨機生成的整數: " + randomNumber);
			boolean isPrime = isPrimeNumber(randomNumber);
			if (isPrime) {
				System.out.println(randomNumber + " 是質數");
			} else {
				System.out.println(randomNumber + " 不是質數");
			}
		}
	}

	// 檢查一個整數是否為質數
	public static boolean isPrimeNumber(int number) {
		if (number <= 1) {
			return false;
		}
		if (number <= 3) {
			return true;
		}
		if (number % 2 == 0 || number % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= number; i += 6) {
			if (number % i == 0 || number % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}
}
