import kr.green.vo.ClassVO;
import kr.green.vo.StudentVO;

public class StudentEx01 {
	public static void main(String[] args) {
		StudentVO stu1 = new StudentVO(2100101, "한사람", 100, 67, 200, -90);
		System.out.println(stu1);
		stu1.setMat(78);
		stu1.setEdps(98);
		System.out.println(stu1);
		
		ClassVO classVO = new ClassVO(10);
		classVO.addStudent(stu1);
		classVO.addStudent(new StudentVO(2100102, "두사람", 55,66,77,88));
		classVO.addStudent(2100103, "세사람", 45,67,89,80);
		
		System.out.println(classVO);

		classVO.addStudent(2100104, "네사람", 45,58,25,80);
		classVO.addStudent(2100105, "오사람", 45,67,89,95);
		classVO.addStudent(2100106, "육사람", 45,67,78,80);
		classVO.addStudent(2100107, "칠사람", 45,69,89,80);
		classVO.addStudent(2100108, "팔사람", 40,67,89,80);
		classVO.addStudent(2100109, "구사람", 45,39,89,80);
		classVO.addStudent(2100110, "십사람", 45,67,89,80);
		classVO.addStudent(2100111, "노사람", 45,67,89,80);
		System.out.println(classVO);
	}
}
