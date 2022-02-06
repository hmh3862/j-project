import java.util.Arrays;
import java.util.Random;

// 선택정렬
public class SelectionSort1 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int ar[] = new int[15];
		for(int i=0;i<ar.length;i++) ar[i] = rnd.nextInt(101); // 0~100사이의 난수로 초기화
		
		System.out.println("원본 : " + Arrays.toString(ar));
		
		// SelectionSort(선택정렬)
		for(int i=0;i<ar.length-1;i++) { // n-1회전 반복
			int k = i; // ?번째것을 선택
			// ?번째것보다 적은 값이 있는 위치를 찾는다.
			for(int j=i+1;j<ar.length;j++) { // 오른쪽에 있는 모든것을 비교하여 제일 적은 값의 위치를 찾는다.
				// if(ar[j]<ar[k]) k = j; // 오름차순
				if(ar[j]>ar[k]) k = j; // 내림차순
			}
			// i번째와 k번째 데이터를 교환한다.
			int temp = ar[k];
			ar[k] = ar[i];
			ar[i] = temp;
			System.out.println(i+1 + "회전 : " + Arrays.toString(ar));
		}
		System.out.println("정렬 후 : " + Arrays.toString(ar));
	}
}
