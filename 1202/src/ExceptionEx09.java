import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;

public class ExceptionEx09 {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("chunja2.txt")){
			
		} catch (InputMismatchException | NullPointerException | IOException e) { // JDK 1.7에 추가
			e.printStackTrace();
		}
		/*
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}
}
