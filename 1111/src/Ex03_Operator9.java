public class Ex03_Operator9 {
	/*
	 * Bitwise Operator : 비트 단위 연산을 수행한다.
	 * 비트 연산시 0은 거짓, 1은 참이다.
	 *   Shift 연산자
	 *   <<  : 지정방향으로 nBit만큼 민다.
	 *   >>> : 
	 *   >>  :
	 */
	public static void main(String[] args) {
		int n = 0XAABBCCDD; // 16진수로 초기화 : 2진수4자리는 16진수 1자리다.
		// 위의 값에서 맨 마지막 바이트 DD의 값을 버리고 싶다.
		System.out.println(Integer.toHexString(n));
		n = n >> 8; // 오른쪽으로 8번 밀면 사라지겠지? 
		System.out.println(Integer.toHexString(n));
		// FFAABBCC : 오른쪽에서 새롭게 들어온 비트가 1로 들어온다.
		n = n >>> 8; // 오른쪽으로 8번 밀면 사라지겠지? 
		System.out.println(Integer.toHexString(n));
		// ffaabb : 오른쪽에서 새롭게 들어온 비트가 0으로 들어온다.
		
		// 나는 아래의 값을 A와 B로 나누어 표시하고 싶다.
		// 상위 4비트와 하위 4비트를 각각 나누어 저장하고 싶다.
		n = 0xAB;
		// 상위 4비트 취하기 : 뒤에 4비트만 지운다.
		int high = n >> 4;
		System.out.println("상위4비트 : " + Integer.toHexString(high));
		// 하위 4비트 취하기 : 앞의 4비트만 지운다.
		// 0으로 AND연산하면 지워지고 1로 AND연산하면 통과!!!
		int low = n & 0x0F;
		System.out.println("하위4비트 : " + Integer.toHexString(low));
		
		// 문제 : 10진수 159를 위의 분리하는 방법으로 16진수로 출력하시오
		n = 159;
		System.out.println("n = " + Integer.toHexString(n));
		// 4비트씩 나누기
		high = n >> 4;
		low = n & 0x0F;
		System.out.println(high + " : " + low);
		// 10보다 적으면 숫자를 그대로 출력하고 10이상이면 ABCDEF로 바꿔서 출력한다.
		System.out.print((char)(high<10 ? high + '0' : high -10 + 'A'));
		System.out.println((char)(low<10 ? low + '0' : low -10 + 'A'));
		System.out.println();
		
		// '0' 과 0은 완전히 다른것이다.
		System.out.println('0' + " : " + 0); // 0 : 0
		System.out.println('0'*2 + " : " + 0 * 2); // 96 : 0
		// '0' * 2 = '0'의 ASCII코드값 48 * 2 = 96
		// 0 * 2 = 0
		
		System.out.println('A' + 0); // 65 = 'A'의 ASCII코드값 65 + 0 
		System.out.println((char)('A' + 0));
		System.out.println((char)('A' + 1));
		System.out.println((char)('A' + 2));
		System.out.println((char)('A' + 3));
		System.out.println((char)(5)); // ASCII코드값 5번인 문자가 출력된다.
		System.out.println((char)(5 + '0')); // '5'로 출력하려면  + '0'을 해줘야 한다.
		
		/*
		 * 1자리일 경우 숫자를 문자로, 문자를 숫자로 바꾸는 방법 
		 1   + '0' = '1' : 숫자 + '0' = 문자숫자
		 '1' - '0' =  1  : 문자숫자 - '0' = 숫자
		 
		 */
		
		
	}
}
