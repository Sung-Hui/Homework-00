package HW5;

public class hw3 {
	  private int intMax = 0;
	    private double doubleMax = 0;

	    public int maxElement(int[][] intArray) {
	        for (int i = 0; i < intArray.length; i++) {
	            for (int j = 0; j < intArray[i].length; j++) {
	                if (intMax < intArray[i][j])
	                    intMax = intArray[i][j];
	            }
	        }
	        return intMax;
	    }

	    public double maxElement(double[][] doubleArray) {
	        for (int i = 0; i < doubleArray.length; i++) {
	            for (int j = 0; j < doubleArray[i].length; j++) {
	                if (doubleMax < doubleArray[i][j])
	                    doubleMax = doubleArray[i][j];
	            }
	        }
	        return doubleMax;
	    }

	    public static void main(String[] args) {
	        int[][] intArray = {
	                { 1, 6, 3 },
	                { 9, 5, 2 }
	        };
	        double[][] doubleArray = {
	                { 1.2, 3.5, 2.2 },
	                { 7.4, 2.1, 8.2 }
	        };
	        hw3 getMax = new hw3();
	        System.out.println(getMax.maxElement(intArray));
	        System.out.println(getMax.maxElement(doubleArray));
	    }
	}

