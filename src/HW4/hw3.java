package HW4;

public class hw3 {

	public static void main(String[] args) {

		String[] Uni = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int count = 0;
		for (int y = 0; y < Uni.length; y++) {                
			for (int x = 0; x < Uni[y].length(); x++) {       
				switch (Uni[y].charAt(x)) {                   
				case 'a', 'i', 'e', 'o', 'u':
					count = 1 + count;                        
				}
			}
		}

		System.out.println("總共有" + count + "個母音");

	}

}
