
public class Ex10_Op2 {
	public static void main(String[] args) {
		int p = 8765467;
		int m[] = {100_0000,10_0000,5_0000,1_0000, 5_000,1_000, 500, 100, 50, 1};
		for(int i=0;i<m.length;i++) {
			System.out.printf("%10d원권 : %4d매\n",m[i], p/m[i]);
			p %= m[i]; 
		}
	}
}
