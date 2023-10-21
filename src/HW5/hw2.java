package HW5;

public class hw2 {
	 private double sum;
	    private int rand;

	    public void randAvg() {
	        System.out.println("本次亂數結果：");
	        for (int i = 0; i <= 10; i++) {
	            rand = (int) (Math.random() * 101);
	            System.out.print(rand + "   ");
	            sum += rand;
	        }
	        System.out.print("\n" + "平均值為" + sum / 10);
	    }

	    public static void main(String[] args) {
	    	hw2 getRandAvg = new hw2();
	        getRandAvg.randAvg();
	    }
	}

