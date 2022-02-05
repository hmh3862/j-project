public class Ex06_Operator5 {
	/*
	 * Bitwise Operator : 비트 단위 연산을 수행한다.
	 * 비트 연산시 0은 거짓, 1은 참이다.
	 *   & : bit AND
	 *   | : bit OR
	 *   ^ : bit XOR
	 *   ~ : bit NOT
	 */
	public static void main(String[] args) {
		int i=1, j=5;
		
		// System.out.println(i && j); // 에러다!! 왜? 연산대상이 true/false가 아니다.\
		// i를 2진수로 : 0001
		// j를 2진수로 : 0101
		// AND         : 0001 => 1
		System.out.println("bit AND : " + (i & j)); 
		// OR          : 0101 => 5
		System.out.println("bit OR  : " + (i | j));
		// XOR(두개값이 다르면 참)    : 0100 => 4
		System.out.println("bit XOR : " + (i ^ j));
		// ~ : 0은 1로 1은 0으로 만든다. 즉, 1의 보수이다.
		System.out.println("bit NOT : " + ~i);
		
		int k = j - i;
		System.out.println(j + " - " + i + " = " + k);
		k = j + (~i + 1); // ~i는 1의 보수, ~i + 1은 2의 보수, 뺄셈은 2의보수의 덧셈이다.
		System.out.println(j + " - " + i + " = " + k);
	}
}
