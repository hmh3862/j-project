// 문자형 : char로 2byte를 확보한다. '(작은 따옴표)로 1글자를 묶어서 표현한다.
public class CharEx {
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println("ch  = " + ch + " : " + (ch+0));
		
		ch = 97;
		System.out.println("ch  = " + ch + " : " + (ch+0));

		// ch = -10; 에러이다  양수만 저장가능하다.
		// ch = "A"; 에러이다 ""는 문자열로 String타입이다.
		// ch=''; 에러이다. 반드시 1글자가 있어야 한다.
		ch='\t'; // 에러가 아니다. 제어 문자열은 1글자로 인식한다.
		System.out.println("ch  = " + ch);
		System.out.println("ch  = " + (ch+0));
		ch = '한';
		System.out.println("ch  = " + ch);
		System.out.println("ch  = " + (ch+0));
		ch = 54621;
		System.out.println("ch  = " + ch + " : " + (ch+0));
		ch = '가';
		System.out.println("ch  = " + ch + " : " + (ch+0));
		ch++;
		System.out.println("ch  = " + ch + " : " + (ch+0));
		ch++;
		System.out.println("ch  = " + ch + " : " + (ch+0));
		ch++;
		System.out.println("ch  = " + ch + " : " + (ch+0));
		
	}
}
