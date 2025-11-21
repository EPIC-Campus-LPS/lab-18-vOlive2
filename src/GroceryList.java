import java.util.ArrayList;
import java.util.Scanner;
public class GroceryList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> items = new ArrayList<>();
		while(true) {
			System.out.print("Enter a item: ");
			String line = scan.nextLine();
			if(line.equals("STOP")) break;
			String[] splitline = line.split(" ");
			for(String s : splitline) {
				items.add(s);
			}
		}
		for(int i = 0; i < items.size(); i++) {
			int c = 1;
			for(int j = i+1; j < items.size(); j++) {
				if(items.get(i).toUpperCase().equals(items.get(j).toUpperCase())) {
					items.remove(j);
					c++;
					j--;
				}
			}
			System.out.println((c) + " " + items.get(i).toUpperCase());
			items.remove(i);
			i--;
		}
	}
}