package game;
import java.util.Random;
public class MinesEx1 {
	static final int ROW = 9, COL = 9; // 행열
	static final int MAX = 10; // 지뢰수
	static int[][] mine = new int[ROW][COL]; // 게임 배열

	public static void main(String[] args) {
		// 9행 9열 : 폭탄은 10개
		// viewGamePanel();
		makeMine();
		viewGamePanel();
		// 배열을 돌면서 9가 아닌경우 둘레의 9의 개수를 세서 그값을 가진다.
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				if(mine[i][j]!=9){ // 9가 아닌경우 둘레의 8군데 9의 숫자 확인
					int cnt = 0;
					// 좌
					if(j>0 && mine[i][j-1]==9) cnt++;
					// 우
					if(j<COL-1 && mine[i][j+1]==9) cnt++;
					// 상
					if(i>0 && mine[i-1][j]==9) cnt++;
					// 하
					if(i<ROW-1 && mine[i+1][j]==9) cnt++;
					// 좌상
					if(i>0 && j>0 && mine[i-1][j-1]==9) cnt++;
					// 우상
					if(i>0 && j<COL-1  && mine[i-1][j+1]==9) cnt++;
					// 좌하
					if(i<ROW-1 && j>0  && mine[i+1][j-1]==9) cnt++;
					// 우하
					if(i<ROW-1 && j<COL-1  && mine[i+1][j+1]==9) cnt++;
					mine[i][j] = cnt; // 9의 개수를 배열에 가진다.
				}
			}
		}
		viewGamePanel();
	}
	// 폭탄을 10개 만든다.
	private static void makeMine() {
		Random r = new Random(); // 난수
		// 배열을 모두 0으로 초기화
		for(int i=0;i<ROW;i++)
			for(int j=0;j<COL;j++)
				mine[i][j] = 0;
		// MAX개만 9로 채운다.
		int row,col;
		for(int i=0;i<MAX;i++){
			do{
				row = r.nextInt(ROW);
				col = r.nextInt(COL);
			}while(mine[row][col]!=0);
			mine[row][col] = 9; // 9가 폭탄
		}
	}
	// 게임판 그리기
	private static void viewGamePanel() {
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				if(mine[i][j]==9)
					System.out.print("＠");
				else
					System.out.printf("%2d",mine[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
