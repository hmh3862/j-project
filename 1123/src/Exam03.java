/*
3이 나타나는 시간을 전부 합하면?
디지털 시계에 하루동안(00:00~23:59) 3이 표시되는 시간을 초로 환산하면 총 몇 초(second) 일까요?
디지털 시계는 하루동안 다음과 같이 시:분(00:00~23:59)으로 표시됩니다.
00:00 (60초간 표시됨)
00:01 
00:02 
...
23:59
*/
public class Exam03 {
	public static void main(String[] args) {
		int secSum = 0;
		for(int h=0;h<24;h++) {
			for(int m=0;m<60;m++) {
				if(h/10==3 || h%10==3 || m/10==3 || m%10==3) secSum += 60;
			}
		}
		System.out.println(secSum);
		secSum = 0;
		for(int h=0;h<24;h++) {
			for(int m=0;m<60;m++) {
				// "문자열1".contains("문자열2") : 문자열1이 문자열2를 포함하고 있으면 참
				if(String.format("%02d:%02d", h, m).contains("3")) secSum += 60;
			}
		}
		System.out.println(secSum);
	}
}
