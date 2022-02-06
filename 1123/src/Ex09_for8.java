/*
반복문은 얼마든지 중첩이 가능하다.
 */
public class Ex09_for8 {
	public static void main(String[] args) {
		for(char i='A';i<='Z';i++) {
			for(char j=i;j<='Z';j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for(char i='A';i<='Z';i++) {
			for(char j='A';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		int k=0;
		for(int i=0;i<20;i++) { // 줄수
			for(int j=0;j<=i;j++) { // 줄당 개수
				System.out.print((char)('A'+k));
				k = ++k%26;
			}
			System.out.println();
		}
		k=0;
		for(int i=0;i<20;i++) { // 줄수
			for(int j=0;j<19-i;j++) // 1줄에 공백 그리고 문자이다. 이 반복문은 공백이다.
				System.out.print(" ");
			for(int j=0;j<=i;j++) { // 줄당 개수 :  1 2 3 4 5 .....
				System.out.print((char)('A'+k));
				k = ++k%26;
			}
			System.out.println();
		}
		// 이등변 삼각형 모양으로 출력하라
		k=0;
		for(int i=0;i<20;i++) { // 줄수
			for(int j=0;j<19-i;j++) // 1줄에 공백 그리고 문자이다. 이 반복문은 공백이다.
				System.out.print(" ");
			for(int j=1;j<=i*2-1;j++) { // 줄당 개수 : i*2-1 :  1 3 5 7 9....
				System.out.print((char)('A'+k));
				k = ++k%26;
			}
			System.out.println();
		}
	}
}
/*
A
BC
DEF
..... ZA
20줄 출력
*/





