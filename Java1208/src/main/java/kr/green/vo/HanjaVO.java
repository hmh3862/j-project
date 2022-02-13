package kr.green.vo;

import lombok.Data;

/*
{
l: "L001",
h: "三三五五",
h1: "三",
h2: "三",
h3: "五",
h4: "五",
k: "삼삼오오",
k1: "삼",
k2: "삼",
k3: "오",
k4: "오",
t: "몇명씩 무리를 지어 다니거나 함께 일을 하는 모양.",
}
 */
@Data
public class HanjaVO {
	private String l;
	private String h;
	private String k;
	private String t;
}
