/*
반복문은 얼마든지 중첩이 가능하다.
 */
public class Ex10_for9 {
	public static void main(String[] args) {
		for(char i='A';i<='J';i++) {
			for(char j='A';j<='J';j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		for(char i='A';i<'J';i++) {
			for(char j='A';j<'J';j++) {
				if(i==j)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//문제 : 1 + 1+2 +1+2+3 + .... + 1+2+3+4+5+6+7+8+9+10 = ?
		int sum = 0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
				sum += j;
			}
			System.out.println();
		}
		System.out.println("답 : " + sum);
	}
}






