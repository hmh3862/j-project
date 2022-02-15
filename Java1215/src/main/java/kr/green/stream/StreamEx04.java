package kr.green.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamEx04 {
	public static void main(String[] args) {
		// 필터 : 데이터를 걸러준다. 중간 연산
		String str = "1234,qwerty,3,12,6";
		str
		.chars() // IntStream 만들기
		.filter(n-> !Character.isDigit((char)n) && !Character.isWhitespace((char)n)) // 숫자도 아니고 Whitespace 아닌것 
		.forEach(n->System.out.print((char)n));
		
		System.out.println();
		
		str
		.chars()
		.filter(n-> Character.isAlphabetic(n)) // 영문자만
		.forEach(n->System.out.print((char)n));
		System.out.println();
		
		// 정규표현식을 이용한 스트림 만들기
		str = "XML,CSS,HTML"; 
	    Pattern.compile(",")
	    .splitAsStream(str)
	    .forEach(System.out::println);
	    
	    // 파일을 이용한 스트림 만들기
	    Path path = Paths.get("pom.xml");
	    try(Stream<String> lines = Files.lines(path)){
	    	lines.forEach(System.out::println);
	    } catch (IOException e) {
			e.printStackTrace();
		}
	    // 파일 목록 보기
	    Path dir = Paths.get(".");
	    System.out.printf("%nThe file tree for %s%n", dir.toAbsolutePath());
		try(Stream<Path> fileTree = Files.walk(dir)){
			fileTree.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
