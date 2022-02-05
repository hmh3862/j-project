public class Ex04_Operator10 {
	/*
	 * int에 색상값을 저장하고 각각 ARGB로 분리하고 결합해보자
	 */
	public static void main(String[] args) {
		// 컴퓨터에서 색상의 자료형은 int이다. AARRGGBB형태로 색상값을 부여한다.
		int color= 0XAABBCCDD; // 16진수로 초기화 : 2진수4자리는 16진수 1자리다.
		
		// 최상위 1Byte만 취하면 alpha값 : 투명도
		int alpha = color >>> 24;
		System.out.println("알파값 : " + Integer.toHexString(alpha));
		alpha = color >> 24 & 0xFF;   // 6자리 날리고 2자리만 취한다.
		System.out.println("알파값 : " + Integer.toHexString(alpha));

		// 두번째 바이트만 취하면 red값 
		int red = color >> 16 & 0xFF; // 4자리 날리고 2자리만 취한다.
		System.out.println("RED값 : " + Integer.toHexString(red));
		
		// 세번째 바이트만 취하면 green값 
		int green = color >> 8 & 0xFF; // 2자리 날리고 2자리만 취한다.
		System.out.println("GREEN값 : " + Integer.toHexString(green));
		
		// 네번째 바이트만 취하면 blue값 
		int blue = color & 0xFF; // 2자리만 취한다.
		System.out.println("BLUE값 : " + Integer.toHexString(blue));
		
		// 색상을 결합해보자
		int color2 = 0;
		System.out.println("색상값 : " + Integer.toHexString(color2));
		// 알파값 결합
		color2 = color2 | alpha << 24;
		System.out.println("색상값 : " + Integer.toHexString(color2));
		
		// RED값 결합
		color2 = color2 | red << 16;
		System.out.println("색상값 : " + Integer.toHexString(color2));

		// GREEN값 결합
		color2 = color2 | green << 8;
		System.out.println("색상값 : " + Integer.toHexString(color2));
		
		// BLUE값 결합
		color2 = color2 | blue;
		System.out.println("색상값 : " + Integer.toHexString(color2));
		
		// RED와 BLUE값만 지워보자
		color2 = color2 & 0xFF00FF00;
		System.out.println("색상값 : " + Integer.toHexString(color2));
		
		// RED와 BLUE값만 AC와 7B로 변경해 보자
		color2 = color2 | 0x00AC007B;
		System.out.println("색상값 : " + Integer.toHexString(color2));
		
		
		
	}
}
