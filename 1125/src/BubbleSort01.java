import java.util.Arrays;
import java.util.Random;

public class BubbleSort01 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int ar[] = new int[10];
		for(int i=0;i<ar.length;i++) ar[i] = rnd.nextInt(101); // 0~100사이의 난수로 초기화
		
		System.out.println("원본 : " + Arrays.toString(ar));
		
		// Bubble Sort
		for(int i=0;i<ar.length-1;i++) { // n-1회전 반복
			for(int j=0;j<ar.length-1-i;j++) {
				if(ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
			System.out.println(i+1 + "회 : " + Arrays.toString(ar));
		}
		System.out.println("정렬 : " + Arrays.toString(ar));
	}
}
