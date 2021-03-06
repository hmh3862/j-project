package kr.green.vo;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class GenderAdapter extends XmlAdapter<String, Boolean>{

	@Override
	public Boolean unmarshal(String v) throws Exception {
		return v.equals("남자") ? true : false;
	}

	@Override
	public String marshal(Boolean v) throws Exception {
		return v ? "남자" : "여자";
	}

}
