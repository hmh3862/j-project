import java.util.Scanner;
// 두개의 정수를 입력받아 나눗셈을 하는 프로그램이다.
// 잘 만든것일까?
// 치명적인 단점이 두가지가 있다.
// 1. 나누는 수에 0을 입력했을 경우
// 2. 정수가 아닌 다른 값을 입력했을 경우
// 이 두가지를 모두 처리를 해주어야 된다.
// 전통적인 예외처리 방법은 if문을 이용하는 것이다.
public class ExceptionEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String temp="";
		while(true){
			System.out.print("첫번째 정수 입력 : ");
			temp = sc.nextLine();
			boolean flag = true;
			for(char ch : temp.toCharArray()) {
				if(ch<'0' || ch>'9') {
					flag = false;
					break;
				}
			}
			if(flag) break;
		}
		int x = Integer.parseInt(temp);
		
		while(true){
			System.out.print("두번째 정수 입력 : ");
			temp = sc.nextLine();
			boolean flag = true;
			for(char ch : temp.toCharArray()) {
				if(ch<'0' || ch>'9') {
					flag = false;
					break;
				}
			}
			if(flag) break;
		}
		int y = Integer.parseInt(temp);
		
		// 1번 해결
		if(y==0) {
			System.out.println("0으로 나눌수 없습니다.");
		}else {
			int result  = x/y;
			System.out.printf("%d / %d = %d\n", x, y, result);
		}
		
		sc.close();
	}
}
