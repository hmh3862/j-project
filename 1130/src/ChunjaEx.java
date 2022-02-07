import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ChunjaEx {
	public static void main(String[] args) throws IOException {
		String hanja = Files.readString(Paths.get("chunja2.txt"));
		System.out.println(hanja);
	}
}
