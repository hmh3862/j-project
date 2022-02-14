package kr.green.generic;

public class GenericMethodEx {
	public static void main(String[] args) {
		Integer ar1[] = {1,2,3,1,3,4,1,2};
		String ar2[]  = "하나,둘,셋,둘,셋".split(",");
		
		System.out.println("1이 " + genericMethod(ar1, 1) + "개있다.");
		System.out.println("'둘'이 " + genericMethod(ar2, "둘")  + "개있다.");
		
		System.out.println("1이 " + getCount(ar1, 1) + "개있다.");
		System.out.println("'둘'이 " + getCount(ar2, "둘")  + "개있다.");
			
	}
	// 배열에서 지정한 아이템과 같은 것이 몇개인지 알려주는 메서드
	// 리턴 타입 앞에 <>를 사용한다.
	public static <T> int genericMethod(T[] array, T item) {
		int count = 0;
		for(T t : array) {
			if(t.equals(item)) count++;
		}
		return count;
	}
	// 제네릭을 사용하지 않는 경우 : 개수를 세는 알고리즘은 동일한데 타입만 다른 여러개의 메서드를 만들어 주어야 한다.
	public static int getCount(Integer[] array, Integer item) {
		int count = 0;
		for(Integer t : array) {
			if(t.equals(item)) count++;
		}
		return count;
	}
	
	public static int getCount(String[] array, String item) {
		int count = 0;
		for(String t : array) {
			if(t.equals(item)) count++;
		}
		return count;
	}
}
