package kr.green.vo;

import lombok.Data;

/*
{
d: "8급",
h: "校",
m: "학교",
m1: "교",
m2: "",
m3: "",
m4: "",
m5: "",
r: "木",
ld: "총10획",
}
 */
@Data
public class DicVO {
	private String d;
	private String h;
	private String m;
	private String m1;
	private String m2;
	private String m3;
	private String m4;
	private String m5;
	private String r;
	private String ld;
	@Override
	public String toString() {
		return d + " : " + h + "(" + m + " " + m1 
	           + (!m2.equals("") ? ", " + m2 + " " + m3 : "")
	           + (!m4.equals("") ? ", " + m4 + " " + m5 : "")
	           + ") 부수 : " + r + ", 총획 : " + ld;
	}
}
