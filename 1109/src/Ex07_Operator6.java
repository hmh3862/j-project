public class Ex07_Operator6 {
	/*
	 * Bitwise Operator : 비트 단위 연산을 수행한다.
	 * 비트 연산시 0은 거짓, 1은 참이다.
	 *   & : bit AND
	 *   | : bit OR
	 *   ^ : bit XOR
	 *   ~ : bit NOT
	 */
	public static void main(String[] args) {
		// XOR의 응용
		int i=1, j= 5;
		System.out.println(i + ", " + j);
		// 두개 변수의 값을 서로 교환하고 출력하시오
		int temp = i; // 임시변수를 사용하는 방법
		i = j;
		j = temp;
		System.out.println(i + ", " + j);
		// i, j만 가지고 문제(교환)를 해결하시오
		i = i ^ j; // 0001 ^ 0101 = 0100 => i : 4
		j = i ^ j; // 0100 ^ 0101 = 0001 => j : 1
		i = i ^ j; // 0100 ^ 0001 = 0101 => i : 5
		System.out.println(i + ", " + j);
	}
}
