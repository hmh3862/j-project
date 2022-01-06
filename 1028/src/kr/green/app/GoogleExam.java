package kr.green.app;

public class GoogleExam {
	public static void main(String[] args) {
		// 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
		int count = 0;// 개수를 세기 위한 변수 선언
		for(int i=1;i<10000;i++) { // 1~9999까지 반복해라
			int temp = i; // 피신
			while(temp>0) { // 숫자가 0보다 클때까지 반복
				if(temp%10==8) { // 맨뒷자리 한개 잘라서 8이라면
					count++; // 개수 증가
				}
				temp /= 10; // 맨 뒷자리 버리기
			}
		}
		// 결과 출력
		System.out.println("8의 개수 : " + count + "개");
	}
}
