package me.gui.text;

import java.awt.*;
import java.text.*;
import java.util.Date;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

/*
 * 패턴을 조합하여 설정합니다.
 * ------------------------------------------
 * # : 수치
 * ? : 문자
 * A : 숫자 또는 문자
 * * : 모든
 * U : 대문자로 매핑 된 문자를 가지는 문자
 * L : 소문자에 매핑 된 문자를 가지는 문자
 * H : 16 진수 (AF, af, 0-9)
 * ' : 다른 마스크 문자 이스케이프 사용
 * ------------------------------------------
 */
public class JFormattedTextFieldTest05 extends JFrame {

	public JFormattedTextFieldTest05() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JFormattedTextField - MaskFormat");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(7,1));
		
		MaskFormatter mf1 = new MaskFormatter("(####)-####-####"); 
		mf1.setPlaceholderCharacter ( '_'); 
		MaskFormatter mf2 = new MaskFormatter("우)###-#### "); 
		mf2.setPlaceholderCharacter ( '_'); 
		MaskFormatter mf3 = new MaskFormatter("####/##/##"); 
		mf3.setPlaceholderCharacter ( '_'); 
		MaskFormatter mf4 = new MaskFormatter("AAAAA@AAAAA.AAAA"); 
		mf4.setPlaceholderCharacter ( '_'); 
		
		JFormattedTextField text1 = new JFormattedTextField (mf1); 
		JFormattedTextField text2 = new JFormattedTextField (mf2); 
		JFormattedTextField text3 = new JFormattedTextField (mf3); 
		JFormattedTextField text4 = new JFormattedTextField (mf4); 
		
		// 초기 값을 설정 
		// setText ()라고 초기 표시시 형식이 평가되지 않기 때문에 setValue ()를 사용 
		text1.setValue (""); 
		text2.setValue (""); 
		text3.setValue (""); 
		text4.setValue (""); 
		add(text1);
		add(text2);
		add(text3);
		add(text4);

		setVisible(true);
	}

	public static void main(String[] args) {
		try {
			new JFormattedTextFieldTest05();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}