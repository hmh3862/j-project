import java.util.Scanner;

/*
1번은 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을 
영어로 출력하는 프로그램을 작성하시오.
해당 번호가 없으면 "I don't know."라고 출력한다.
개-dog
고양이-cat
병아리-chick​  
*/
public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 개");
			System.out.println("2. 고양이");
			System.out.println("3. 병아리");
			System.out.println("0. 종료");
			System.out.print("\n원하는 번호를 입력하시오 ");
			int num = sc.nextInt();
			if(num==0) break;
			switch (num) {
			case 1:
				System.out.println("dog");
				break;
			case 2:
				System.out.println("cat");
				break;
			case 3:
				System.out.println("chick");
				break;
			default :
				System.out.println("몰라유~~~");
			}// end switch
			System.out.println();
		}// end while
		sc.close();
	}// end main
}// end class
