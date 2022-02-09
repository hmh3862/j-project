import java.util.Comparator;
import java.util.Vector;

public class VectorEx {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// JDK 1.4이전의 사용방법
		Vector v = new Vector(10);
		System.out.println("용량 : " + v.capacity());
		System.out.println("개수 : " + v.size());
		
		v.add(10);
		v.add(10.5);
		v.add('A');
		v.add("문자열");
		v.add(true);
		
		System.out.println(v);
		System.out.println("용량 : " + v.capacity());
		System.out.println("개수 : " + v.size());
		
		for(int i=0;i<10;i++) v.add(i);
		
		System.out.println(v);
		System.out.println("용량 : " + v.capacity());
		System.out.println("개수 : " + v.size());
		
		v.sort(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				String s1 = o1 + "";
				String s2 = o2 + "";
				return s1.compareTo(s2);
			}
			
		});
		
		System.out.println(v);
		System.out.println("용량 : " + v.capacity());
		System.out.println("개수 : " + v.size());
		
	}
}
