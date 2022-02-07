import java.util.Scanner;

/*
알파벳 소문자를 입력하고 각각 개수를 세는 프로그램을 출력하시오
*/
public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 소문자 길게 입력 : ");
		String line = sc.nextLine();
		int ar[] = new int[26];
				
		for(char ch : line.toCharArray()) {
			ar[ch-'a']++;
		}
		for(int i=0;i<ar.length;i++) {
			System.out.println((char)('a' + i) + " : " + ar[i] + "개");
		}
		sc.close();
	}
}
