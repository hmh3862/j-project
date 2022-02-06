import java.util.Arrays;

/*
배열(Array) : 동일한 자료형의 집합
              참조형이다.
 */
public class Ex04_Array3 {
	public static void main(String[] args) {
		// 깊은복사 : 배열의 내용을 복사한다.
		int ar1[] = {1,2,3,4,5,6,7,8,9,10};
		
		// 1. System.arraycopy(원본, 시작위치, 사본, 시작위치, 개수);
		int ar2[] = new int[ar1.length];
		System.arraycopy(ar1, 0, ar2, 0, ar1.length);
		ar2[0] = 99;
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		System.out.println();
		// 부분복사
		int ar3[] = new int[10];
		System.arraycopy(ar1, 3, ar3, 1, 5);
		System.out.println(Arrays.toString(ar3));
		System.out.println();
		
		// 2. 가장 일반적인 방법
		int[] ar4 = ar1.clone();
		ar4[9] = 100;
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar4));
		System.out.println();
		
		// 3. Arrays.copyof(원본, 길이)를 이용한 깊은 복사
		int ar5[] = Arrays.copyOf(ar1, ar1.length);
		ar5[3] = 44;
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar5));
		System.out.println();		
		// 부분 복사이지만 무조건 첫번째 부터이다.
		int ar6[] = Arrays.copyOf(ar1, ar1.length-4);
		ar6[1] = 22;
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar6));
		System.out.println();	
		
		// 4. Arrays.copyOfRange(원본, 시작위치, 끝위치+1)를 이용한 복사
		int ar7[] = Arrays.copyOfRange(ar1, 2, 6);
		System.out.println(Arrays.toString(ar7));
		System.out.println();	
		
				
		
	}
}
