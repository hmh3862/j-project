import java.util.Random;

/*
학생이 20명이 있다. 무작위로 뽑아 4개의 팀으로 만들고 싶다. 
 */
public class Group {
	public static void main(String[] args) {
		int stu[] = new int [20]; // 학생 20명
		Random rnd = new Random();
		int temp;
		
		for(int i=1;i<=4;i++) { // 팀수
			for(int j=0;j<5;j++) { //팀 인원
				do {
					temp = rnd.nextInt(stu.length);
				}while(stu[temp]!=0); // 0이 입력된 위치를 찾는다.
				stu[temp] = i; // 팀번호를 부여한다.
			}
			// System.out.println(Arrays.toString(stu));
		}
		// 출력
		for(int i=1;i<=4;i++) { // 팀수
			System.out.print(i + "번 팀 : ");
			for(int j=0;j<stu.length;j++) {
				if(stu[j]==i) System.out.printf("%3d", j+1);
			}
			System.out.println();
		}
	}
}
