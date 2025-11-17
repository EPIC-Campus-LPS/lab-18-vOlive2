import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Temp temp = new Temp();
		temp.scan();
		System.out.print(temp.stats());
	}
}
