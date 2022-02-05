public class Ex02_Operator8 {
	/*
	 * Bitwise Operator : 비트 단위 연산을 수행한다.
	 * 비트 연산시 0은 거짓, 1은 참이다.
	 *   Shift 연산자
	 *   <<  : 지정방향으로 nBit만큼 민다.
	 *   >>> : 
	 *   >>  :
	 */
	public static void main(String[] args) {
		int n = 8;
		System.out.println("n = " + n);		// 0000	1000 = 8
		
		int n1 = n >>  1;
		int n2 = n >>> 1;
		System.out.println(n1 + " : " + n2); // 4 : 4 
		System.out.println(Integer.toHexString(n1) + " : " + Integer.toHexString(n2));// 4 : 4
		// 양수의 경우는 >>, >>> 동일한 연산을 수행한다.
		System.out.println();
		
		n = -8;
		System.out.println("n = " + n);		
		
		n1 = n >>  1;
		n2 = n >>> 1;
		System.out.println(n1 + " : " + n2); // -4 : 2147483644
		System.out.println(Integer.toHexString(n1) + " : " + Integer.toHexString(n2));
		// fffffffc : 7ffffffc
		// 음수의 경우는 다르게 계산된다. 
		// 오른쪽으로 새롭게 들어오는 비트가 부호비트를 변경하느냐의 유무이다. 
	}
}
