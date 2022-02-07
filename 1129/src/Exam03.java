import java.util.Scanner;
/*
 * 긴 문자열을 입력받아 소문자는 대문자로 대문자는 소문자로 이외의 글자는 그대로 출력하시오
 * 단어의 갯수는 어떻게 셀까?
*/
public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("긴 문자열 입력 : ");
		String line = sc.nextLine();
		int wordCount = 0;
		char oldChar='A';
		for(char ch : line.toCharArray()) {
			if(ch>='a' && ch<='z') { // 소문자라면
				System.out.print((char)(ch-32)); // 'A' = 65, 'a' = 97 두개의 간격은 32차이이다.
			}else if(ch>='A' && ch<='Z') { // 대문자라면
				System.out.print((char)(ch+32));
			}else { // 영문자가 아니라면
				System.out.print(ch);
				if((oldChar!=' ' && oldChar!='\t' && oldChar!='\n') && (ch==' ' || ch=='\t' ||  ch=='\n')) wordCount++;
			}
			oldChar = ch;
		}
		System.out.println();
		System.out.println(wordCount + "단어");
		sc.close();
	}
}
