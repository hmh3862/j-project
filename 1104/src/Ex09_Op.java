
public class Ex09_Op {
	public static void main(String[] args) {
		// 생년월일을 저장하려고 한다. 어떻게 저장할까?
		// 18바이트=2*9 (String뒤에는 null문자 자동삽입)
		String birth1 = "19920822"; 
		// 4바이트 차지
		int    birth2 = 19920822;   
		System.out.println("생일 : " + birth1);
		System.out.println("생일 : " + birth2);
		// 위의 어떤것이 용량이 적게 차지할까?
		// 년월일을 따로 분리해보자
		// 1992년 8월 22일 로 출력해보자!!!!
		int year = birth2/10000;
		System.out.print(year + "년 ");

		// int month = birth2/100%100;
		int month = birth2%10000/100;
		System.out.print(month + "월 ");
		
		int date = birth2%100;
		System.out.println(date + "일 ");
		
		// 숫자를 세로로 꺼꾸로 찍어보자
		int temp = birth2;
		while(temp>0) { // 모든 자릿수가 사라질때까지 반복
			System.out.println(temp%10); // 10으로 나눈나머지는 맨 뒷자리 1개 
			temp = temp / 10; // 10으로 나누어 맨뒷자리 버리기
		}
		System.out.println();
		// 숫자를 세로로 찍어보자
		temp = birth2;
		int length = 1000_0000; // JDK 1.7부터는 정수에 _을 넣을 수 있다.
		while(length>0) {
			System.out.println(temp/length); // 앞자리 1자리 자르기
			temp %= length; // 뒤의 나머지만 취하기
			length /= 10;   // 단위 줄이기
		}
	}
}
