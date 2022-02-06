
public class Exam08 {
	public static void main(String[] args) {
		// 지그재그로 출력하기
		for(int i=0;i<10;i++) { // 10줄
			int step = i%2==0 ? 1 : -1; // 증가값
			int start = i%2==0 ? i*10+1 : (i+1)*10; // 행의 시작값 
			for(int j=0;j<10;j++) { // 10개
				System.out.printf("%3d", start);
				start += step;
			}
			System.out.println();
		}
	}
}
