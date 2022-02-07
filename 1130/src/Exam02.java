import java.util.Arrays;
import java.util.Comparator;

public class Exam02 {
	public static String solution(int[] numbers) {
		String answer = "";
		String[] t = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) t[i] = numbers[i] + "";
		Arrays.sort(t, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			}
		});
		answer = String.join("", t);
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {6, 10, 2}));
		System.out.println(solution(new int[] {3,30,34,5,9}));
	}
}
