package kr.green.vo;

// 학생 1명의 성적을 저장하기 위한 클래스
public class StudentVO {
	private int stuNum;
	private String name;
	private int kor,eng,mat,edps, rank=1;

	public StudentVO(int stuNum, String name, int kor, int eng, int mat, int edps) {
		this.stuNum = stuNum;
		this.name = name;
		this.kor = kor<0 || kor>100 ? 0 : kor;
		this.eng = eng<0 || eng>100 ? 0 : eng;
		this.mat = mat<0 || mat>100 ? 0 : mat;
		this.edps = edps<0 || edps>100 ? 0 : edps;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor<0 || kor>100 ? 0 : kor ;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng <0 || eng>100 ? 0 : eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat <0 || mat>100 ? 0 : mat;
	}

	public int getEdps() {
		return edps;
	}

	public void setEdps(int edps) {
		this.edps = edps <0 || edps>100 ? 0 : edps;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getStuNum() {
		return stuNum;
	}

	public String getName() {
		return name;
	}
	// 총점구하는 메서드 추가
	public int getTotal() {
		return kor + eng + mat + edps;
	}
	// 평균을 구하는 메서드 추가
	public double getAvg() {
		return getTotal()/4.0;
	}
	
	@Override
	public String toString() {
		return String.format("%-6s %-4s %5d %5d %5d %5d %5d %7.2f %5d",
				stuNum, name, kor, eng, mat, edps, getTotal(), getAvg(), rank);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stuNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentVO other = (StudentVO) obj;
		if (stuNum != other.stuNum)
			return false;
		return true;
	}
}
