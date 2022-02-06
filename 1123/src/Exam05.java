/*
완전수 : 자기 자신을 제외한 모든 양의 약수들의 합이 자기 자신이 되는 자연수

1~1000사이의 완전수를 모두 출력하시오!!!!

1. 1~1000까지 반복한다.
2. 반복되는 수의 약수의 합을 구한다.
3. 약수의 합과 자신이 같다면 출력한다.
 */
public class Exam05 {
	public static void main(String[] args) {
		for(int i=1;i<=1000;i++) { // 1번 해결
			int sum = 0;
			for(int j=1;j<i;j++) { // 2번 해결
				if(i%j==0) sum += j; 
			}
			if(i==sum) System.out.print(i + " "); // 3번 해결
		}
	}
}
