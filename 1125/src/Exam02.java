import java.util.Arrays;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = new String[10];
		System.out.println("공백으로 구분하여 10글자 입력 : ");
		for(int i=0;i<str.length;i++)
			str[i] = sc.next();
		sc.close();
		
		System.out.println(Arrays.toString(str));
		
		System.out.println(String.join("", str));
		for(int i=0;i<str.length;i++)System.out.print(str[i]);
	}
}
