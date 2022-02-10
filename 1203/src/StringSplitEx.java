import java.util.Arrays;

public class StringSplitEx {
	public static void main(String[] args) {
		String[] names1 = "일-이-삼-사-오-육-칠-팔-구-십".split("-");
		String[] names2 = "일-이-삼-사-오--육---칠-팔-구-십".split("-");
		String[] names3 = "일-이-삼-사-오--육---칠-팔-구-십".split("-", 10); // 몇개의 배열로 만들어라
		
		System.out.println(names1.length + Arrays.toString(names1));
		System.out.println(names2.length + Arrays.toString(names2));
		System.out.println(names3.length + Arrays.toString(names3));
	}
}
