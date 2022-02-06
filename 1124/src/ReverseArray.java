import java.util.Arrays;

// 배열 뒤집기
public class ReverseArray {
	public static void main(String[] args) {
		int ar1[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("뒤집기 전 : " + Arrays.toString(ar1));
		// 위의 배열을 뒤집은 후 출력하시오
		// 1. 동일한 크기의 배열을 만든다.
		int ar2[] = new int[ar1.length];
		// 2. 역으로 복사한다.
		for(int i=0;i<ar1.length;i++) {
			ar2[ar2.length-1-i] = ar1[i];
		}
		System.out.println("중간 작업 : " + Arrays.toString(ar2));
		
		// 3. 복사된 배열을 다시 원본에 복사한다. 
		for(int i=0;i<ar1.length;i++) {
			ar1[i] = ar2[i];
		}
		System.out.println("뒤집기 후 : " + Arrays.toString(ar1));
		System.out.println();
		// 위의 방법에서 임시 배열을 사용하지 않고 해결할 수 있을까?
		for(int i=0;i<ar1.length/2;i++) { // 배열 크기의 절반만 반복
			int temp = ar1[i];
			ar1[i] = ar1[ar1.length-1-i];
			ar1[ar1.length-1-i] = temp;
			System.out.println("중간 작업 : " + Arrays.toString(ar1));
		}
		System.out.println("뒤집기 후 : " + Arrays.toString(ar1));
	}
}
