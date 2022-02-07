// 년도 : 세차
//   월 : 월건
//   일 : 일진
// 신축(辛丑)년 무술(戊戌)월 계축(癸丑)일
public class CalEx08 {
	public static void main(String[] args) {
		String gan[] = "갑을병정무기경신임계".split("");
		String ji[] = "자축인묘진사오미신유술해".split("");
		
		// 60갑자 찍어보자
		int g = 0;
		int j = 0;
		for(int i=0;i<61;i++) {
			System.out.print(gan[g] + ji[j] + " ");
			if((i+1)%10==0) System.out.println(); // 10의 배수마다 줄바꿈
			// 증가
			g = ++g%gan.length; // 0~9반복
			j = ++j%ji.length;  // 0~11까지가 반복
		}
		System.out.println();
		
		int year = 2021;
		year -= 4;
		System.out.println(gan[year%10] + ji[year%12] + "년");
		
		for(int i=2010;i<=2030;i++) {
			year = i-4;
			System.out.println(i + " : " + gan[year%10] + ji[year%12] + "년");
		}
		
	}
}
