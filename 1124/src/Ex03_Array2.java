import java.util.Arrays;

/*
배열(Array) : 동일한 자료형의 집합
              참조형이다.
 */
public class Ex03_Array2 {
	public static void main(String[] args) {
		int ar1[] = {4,3,2,1};
		int ar2[] = ar1; // 배열 변수에 배열명 대입
		
		// 얕은복사 : 주소가 복사된다.
		
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		// 두개 배열의 내용이 같다 복사일까요?
		
		// ar1배열의 값을 변경
		ar1[2] = 99;
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		// 1개만 변경했는데 두개가 모두 변경되었다. 결국 배열은 1개이고 ar1과 ar2가 같은 배열을 가리키고있다.
		// 배열명은 배열의 위치를 저장하는 참조형 변수이다.
		
		// 깊은 복사 : 내용을 복사하고 싶다.
		int ar3[] = new int[ar1.length]; // 동일한 크기의 배열을 만들고
		for(int i=0;i<ar1.length;i++) ar3[i] = ar1[i]; // 하나하나 복사를 한다.
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar3));
		ar3[3] = 88;
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar3));
		// 1개의 배열만 변경되었다. 각각 ar1과 ar3은 다른 배열이다.
		
	}
}
