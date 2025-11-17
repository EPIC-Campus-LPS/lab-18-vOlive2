import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
public class Temp {
	private ArrayList<Double> temps = new ArrayList<>();
	public void scan() throws IOException {
		File f = new File("temp.txt");
		Scanner scan = new Scanner(f);
		String[] l = scan.nextLine().split(" ");
		for(int i = 0; i < l.length; i++) {
			temps.add(Double.parseDouble(l[i]));
		}
		for(Double d : temps) {
			System.out.print(d + ", ");
		}
	}
	public String stats() {
		double max = temps.get(0), min = temps.get(0), ave = 0;
		for(double d : temps) {
			if(d > max) max = d;
			if(d < min) min = d;
			ave+=d;
		}
		int slots = 10;
		while(true) {
			if(temps.size() > slots) slots*=2;
			else break;
		}
		String stats = "\nThe max temp is: " + max + 
					   "\nThe min temp is: " + min + 
					   "\nThe max average is: " + ave/temps.size() +
					   "\nThe slots of memory that are taken are: " + slots;
		return stats;
	}
}
