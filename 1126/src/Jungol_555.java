import java.util.Scanner;

/*
 * 문자 10개를 입력받아 붙여서 출력하시오
 */
public class Jungol_555 {
	public static void main(String[] args) {
		String[] str = new String[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 10개입력");
		for(int i=0;i<str.length;i++) {
			str[i] = sc.next();
		}
		for(String s : str) {
			System.out.print(s);
		}
		System.out.println();
		System.out.print(str[0] + str[3] + str[6]);
		sc.close();
	}
}
