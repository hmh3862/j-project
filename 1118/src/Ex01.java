import java.util.Scanner;

/*
게시판 페이징
A씨는 게시판 프로그램을 작성하고 있다.
A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로
주었을 때 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.

입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) 
       (단 n은 1보다 크거나 같다. n >= 1)
출력 : 총페이지수

A씨가 필요한 프로그램을 작성하시오.

m	n	출력
0	1	0
1	1	1
2	1	2
1	10	1
10	10	1
11	10	2

(5-1)/10  + 1 = 1
(6-1)/10  + 1 = 1
(7-1)/10  + 1 = 1
(8-1)/10  + 1 = 1
(9-1)/10  + 1 = 1
(10-1)/10  + 1 = 1 // 배수인 경우 -1을 하면 배수가 아닌수가 된다. 그러면 무조건 +1해줘도 된다. 
(11-1)/10  + 1 = 2
(12-1)/10  + 1 = 2

 */
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		/*
		int page = m/n; // 전체개수 / 페이지당글수 = 총페이지수
		if(m%n!=0) page++; // 배수가 아니면 +1을 해줘야 한다.
		*/
		/*
		int page = m/n + 1; // 무조건 몫에다가 더하기 1을 한다.
		if(m%n==0) page--;  // 배수면 1을 빼준다.
		*/
		int page = (m-1)/n + 1;
		System.out.println(page);
		sc.close();
	}
}
