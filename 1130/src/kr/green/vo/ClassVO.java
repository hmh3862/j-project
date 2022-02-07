package kr.green.vo;

// 1반의 성적을 처리하기 위한 클래스
public class ClassVO {
	private StudentVO[] students;
	private int count = 0; // 인원수
	// 생성자
	public ClassVO() {
		students = new StudentVO[30]; // 그냥 생성되면 30명을 기분으로
	}
	public ClassVO(int count) {
		students = new StudentVO[count]; // 정수 1개를 받으면 받은 숫자만큼의 학생배열 생성
	}
	// getter & setter
	public StudentVO[] getStudents() {
		return students;
	}
	public void setStudents(StudentVO[] students) {
		this.students = students;
	}
	// 학생을 추가하는 메서드
	public void addStudent(StudentVO vo) {
		if(count<students.length) {
			students[count] = vo;
			count++;
		}else {
			System.out.println("정원 초과!!!!");
		}
	}
	public void addStudent(int stuNum, String name, int kor, int eng, int mat, int edps) {
		if(count<students.length) {
			students[count] = new StudentVO(stuNum, name, kor, eng, mat, edps);
			count++;
		}else {
			System.out.println("정원 초과!!!!");
		}
	}
	// 석차를 구하는 메서드 추가
	private void calcRank() {
		// 전체를 1등으로 만든다.
		for(int i=0;i<count;i++) students[i].setRank(1);
		// 석차를 구한다.
		for(int i=0;i<count-1;i++) {
			for(int j=i+1;j<count;j++) {
				if(students[i].getTotal()>students[j].getTotal()) {
					students[j].setRank(students[j].getRank()+1);
				}else if(students[i].getTotal()<students[j].getTotal()) {
					students[i].setRank(students[i].getRank()+1);
				}
			}
		}
	}
	
	@Override
	public String toString() {
		calcRank();
		String result = "전체 : " + count + "명\n";
		for(int i=0;i<count;i++) {
			result += students[i] + "\n";
		}
		return result;
	}
}