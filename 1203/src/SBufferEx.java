
public class SBufferEx {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(100);
		
		System.out.println("용량 : " + sb1.capacity());
		System.out.println("길이 : " + sb1.length());
		System.out.println("용량 : " + sb2.capacity());
		System.out.println("길이 : " + sb2.length());
		System.out.println();
		
		for(int i=0;i<52;i++) sb1.append((char)('a' + i%26));
		System.out.println("용량 : " + sb1.capacity());
		System.out.println("길이 : " + sb1.length());
		System.out.println(sb1);
	}
}
