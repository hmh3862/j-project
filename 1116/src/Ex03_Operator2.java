// 복합대입 연산자
// +=, -=, *=, /= , .......
public class Ex03_Operator2 {
	public static void main(String[] args) {
		float pi = 3.141592f;
		
		System.out.println("pi = " + pi);
		// 소수 첫째자리 버림
		System.out.println("pi = " + (int)pi);
		// 소수 둘째자리 버림
		System.out.println("pi = " + (int)pi*10/10);
		System.out.println("pi = " + (int)(pi*10)/10f);
		// 소수 셋째자리 버림
		System.out.println("pi = " + (int)(pi*100)/100f);
		System.out.println();
		
		int i = 5678987;
		System.out.println("i = " + i);
		// 1의 자리 버림
		System.out.println("i = " + i/10*10);
		// 10의 자리 버림
		System.out.println("i = " + i/100*100);
		// 100의 자리 버림
		System.out.println("i = " + i/1000*1000);
		System.out.println();
		
		// 1의 자리 반올림
		System.out.println("i = " + (i+5)/10*10);
		// 10의 자리 반올림
		System.out.println("i = " + (i+50)/100*100);
		// 100의 자리 반올림
		System.out.println("i = " + (i+500)/1000*1000);
		System.out.println();
		
		i = 12341234;
		// 1의 자리 올림
		System.out.println("i = " + (i+9)/10*10);
		// 10의 자리 올림
		System.out.println("i = " + (i+90)/100*100);
		// 100의 자리 올림
		System.out.println("i = " + (i+900)/1000*1000);
		System.out.println();
	
		// 7버림 8올림
		i = 77;
		System.out.println("i = " + (i+2)/10*10);
		i = 78;
		System.out.println("i = " + (i+2)/10*10);
		
	}
}
