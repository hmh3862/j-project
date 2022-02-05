public class Ex01_Operator7 {
	/*
	 * Bitwise Operator : 비트 단위 연산을 수행한다.
	 * 비트 연산시 0은 거짓, 1은 참이다.
	 *   Shift 연산자
	 *   <<  : 지정방향으로 nBit만큼 민다.
	 *   >>> : 
	 *   >>  :
	 */
	public static void main(String[] args) {
		int n = 1;
		System.out.println("n = " + n);		// 0000	0001 = 1
		
		n = n << 1;
		System.out.println("n = " + n);		// 0000 0010 = 2 = 1 * 2
		n = n << 1;
		System.out.println("n = " + n);		// 0000	0100 = 4 = 2 * 2
		n = n << 2;
		System.out.println("n = " + n);		// 0001 0000 = 16 = 4 * 4
		n = n << 3;
		System.out.println("n = " + n);		// 1000 0000 = 128 = 16 * 8
		// n << m : n * 2의 m승한 효과가있다.
		
		n = n >> 1;
		System.out.println("n = " + n);		// 0100 0000 = 64 = 128 / 2
		n = n >> 1;
		System.out.println("n = " + n);		// 0010 0000 = 32 = 64 / 2
		n = n >> 2;
		System.out.println("n = " + n);		// 0000 1000 = 8  = 64 / 4
		n = n >> 3;
		System.out.println("n = " + n);     // 0000 0001 = 1  = 8 / 8 
 		// n << m : n / 2의 m승한 효과가있다.
	}
}
