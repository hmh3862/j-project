/*
고집수:
10 ~ 99까지 두 자리 수의 각 자리수를 분할하여 곱합니다.
- 그 곱한 수를 마찬가지로 분할하여 다시 곱해주고 이 과정을 반복해서 1의 자리수로 만듭니다.
- 이렇게 곱해 나가는 반복 '횟수'를 고집수라고 하며 출력형식과 같이
고집수가 4이상 되는 수들만 출력합니다.
ex) 77 -> 49 -> 36 -> 18 ->8 (고집수, 반복횟수 4회), 96 -> 54 -> 20 -> 0 (고집수 아님, 반복횟수 3회)

문제 : 10~99사이의 모든 고집수를 출력하시오!!!

해결방법
1. 10~99까지 반복한다.
2. 각각의 자리를 곱하기를 반복한다. 10보다 적을때까지... 반복할때마다 횟수를 세어준다.
3. 반복횟수가 4이상이면 출력한다.
*/
public class Exam06 {
	public static void main(String[] args) {
		for(int i=10;i<100;i++) { // 1번 해결
			int count = 0;
			int temp = i;
			//System.out.print(i + " : ");
			do {
				temp = (temp/10) * (temp%10);
				count++;
				//System.out.print( temp + " ");
			}while(temp>10); // 2번 해결
			// System.out.println(" : " + count + "회");
			if(count>=4) System.out.println(i); // 3번 해결
		}
		
		// 100~999사이의 고집수
		for(int i=100;i<1000;i++) { // 1번 해결
			int count = 0;
			int temp = i;
			do {
					   // 100자리 * 10의자리 * 1의자리
				temp = (temp/100) * (temp/10%10) * (temp%10);
				count++;
			}while(temp>10); // 2번 해결
			if(count>=4) System.out.println(i); // 3번 해결
		}
	}

}
