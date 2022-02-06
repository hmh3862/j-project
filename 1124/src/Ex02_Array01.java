import java.util.Arrays;

/*
배열(Array) : 동일한 자료형의 집합
              참조형이다.
 */
public class Ex02_Array01 {
	public static void main(String[] args) {
		int ar1[]; // 배열변수 선언
		// System.out.println(ar1); // 에러!! 변수만 선언되었지 메모리가 할당되지 않았다.
		ar1 = new int[5];
		System.out.println(ar1); // [I@53bd815b 출력 : 주소를 저장하고 있다 ==> 참조형 변수다.
		System.out.println("배열의 크기 : " + ar1.length);
		for(int i=0;i<ar1.length;i++) {
			System.out.println("ar1[" + i + "] = " + ar1[i]); // 배열 요소 개별 접근은 첨자로 한다. 0~n-1까지이다.
															  // 배열의 내용은 자동 초기화 된다.
		}
		// ar1[5] = 100; // 컴파일 에러가 아니다. 하지만 실행시 에러(런타임에러)가 발생한다.
			   		     // ArrayIndexOutOfBoundsException 예외 발생
		
		// JDK 1.5부터는 Arrays클래스를 이용하여 배열 내용 출력이 가능하다.
		System.out.println(Arrays.toString(ar1));
		
		// 배열 선언과 동시에 초기화가 가능하다.
		int ar2[] = {11,22,33,44,55,66,77,88};
		System.out.println("크기 : " + ar2.length);
		System.out.println("내용 : " + Arrays.toString(ar2));
		
		int ar3[];
		// ar3 = {11,22,33,44,55,66,77,88}; 선언후 {}로 초기화 할 수 없다.
		ar3 = new int[]{11,22,33,44}; // 선언후 초기화는 new 연산자로 값을 할당해야 한다.
		System.out.println("크기 : " + ar3.length);
		System.out.println("내용 : " + Arrays.toString(ar3));		
		
		int ar4[] = new int[20];
		for(int i=0;i<ar4.length;i++) ar4[i] = (i*1) * 2; // 배열 요소에 변화를 줄경우에는 for(int i=0;i<ar4.length;i++)를 사용
		ar4[10] = 99;
		System.out.println("크기 : " + ar4.length);
		System.out.println("내용 : " + Arrays.toString(ar4));
		int sum = 0;
		for(int n : ar4) sum += n; // 배열의 값을 참조만 할 경우에는 for(int n : ar4)문을 사용합니다.
		System.out.println("합계 : " + sum);
	}
}
