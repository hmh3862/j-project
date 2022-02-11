package kr.green.maven.vo;

import lombok.Getter;

@Getter
public class StudentVO {
	private String name;
	private int kor,eng,mat,edps, rank=1;
	
	public StudentVO(String name, int kor, int eng, int mat, int edps) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.edps = edps;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public void setEdps(int edps) {
		this.edps = edps;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public int getTotal() {
		return kor + eng + mat + edps;
	}
	public double getAvg() {
		return getTotal()/4.0;
	}
	@Override
	public String toString() {
		return String.format("%-5s %5d %5d %5d %5d %5d %7.2f %5d", name, kor, eng, mat, edps, getTotal(), getAvg(), rank);
	}
}
