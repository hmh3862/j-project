
public class CommandLineGuGu {
	public static void main(String[] args) {
		int dan = 2;
		if(args.length>=1) {
			try {
				dan = Integer.parseInt(args[0]);
			}catch (Exception e) {
				; // 에러가 나도 아무짓도 하지 않겠다.
			}
		}
		
		System.out.println(dan + "단");
		for(int i=1;i<10;i++) {
			System.out.println(dan + " * " + i + " = " + (i*dan));
		}
	}
}
