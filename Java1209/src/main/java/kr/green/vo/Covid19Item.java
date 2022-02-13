package kr.green.vo;
/*
게시글번호(감염현황 고유값)	SEQ				30		필수	74	게시글번호(감염현황 고유값)
기준일						STATE_DT		30		필수	20200315	기준일
기준시간					STATE_TIME		30		필수	00:00	기준시간
확진자 수					DECIDE_CNT		15		필수	8162	확진자 수
사망자 수					DEATH_CNT		15		필수	75	사망자 수
누적 검사 수				ACC_EXAM_CNT	15		필수	268212	누적 검사 수
누적 확진률					ACC_DEF_RATE	30		필수	3.2396602365	누적 확진률
등록일시분초				CREATE_DT		30		필수	2020-03-15 10:01:22.000	등록일시분초
수정일시분초				UPDATE_DT		30		필수	null	수정일시분초 
<item>
	<accExamCnt>17870821</accExamCnt>
	<createDt>2021-12-09 09:05:11.285</createDt>
	<deathCnt>4077</deathCnt>
	<decideCnt>496584</decideCnt>
	<seq>722</seq>
	<stateDt>20211209</stateDt>
	<stateTime>00:00</stateTime>
	<updateDt>null</updateDt>
</item>
 */

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name="item")
@Data
public class Covid19Item {
	private String 	createDt;
	private int 	accExamCnt;
	private int 	deathCnt;
	private int 	decideCnt;
}
