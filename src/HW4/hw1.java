package HW4;
import java.util.Arrays;
public class hw1 {
	public static void main (String[]args) {
		int[]Array = {29,100,39,41,50,8,66,77,95,15};
		int sum = 0;
		int avg = 0;
		for(int i=0;i<10;i++) {
			sum += Array[i];
		}
		avg = sum/(Array.length);
		System.out.print("平均值:"+avg);
		Arrays.sort(Array);
		System.out.print("大於平均值的元素:");
		for(int j =0;j<10;j++) {
			if(Array[j]>avg) {
				System.out.print(Array[j]+" ");
			}
		}
}
}