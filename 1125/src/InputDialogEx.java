import javax.swing.JOptionPane;

public class InputDialogEx {
	public static void main(String[] args) {
		// 메세지 박스 출력
		JOptionPane.showMessageDialog(null, "보이냐", "제목", JOptionPane.CLOSED_OPTION);
		
		// 예/아니오/취소 묻기 대화상자 출력
		int result = JOptionPane.showConfirmDialog(null, "정말 끝낼껴?");
		if(result == JOptionPane.YES_OPTION) {
			System.out.println("예를 눌렀냐!!!");
		}else if(result == JOptionPane.NO_OPTION) {
			System.out.println("아니오를 눌렀냐!!!");
		}else {
			System.out.println("취소를 눌렀군!!!!");
		}
		
		// 입력받기
		String temp = JOptionPane.showInputDialog("몇살이니?", 20);
		System.out.println("내년에는 " + (temp+1)  + "살이겠네");
		System.out.println("내년에는 " + (Integer.parseInt(temp)+1)  + "살이겠네");
	}
}
