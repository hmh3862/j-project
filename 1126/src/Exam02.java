
public class Exam02 {
	public static void main(String[] args) {
		int n=100;
		System.out.println("n = " + n);
		for(int i=2;i<=16;i++) {
			System.out.println(n + "을 " + i + "진법으로 바꾸면 " + Integer.toString(n, i));
		}
	}
}
