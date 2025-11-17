import java.util.ArrayList;
import java.util.Scanner;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class GroceryList {
    public static void main(String[] args) {
        String url = "https://www.wholefoodsmarket.com/grocery/search?k=chicken"; // Replace with your target URL
        try {
            Document doc = Jsoup.connect(url).get();
            Elements classes = doc.select("span"); // Select all anchor tags with href attribute

            for (Element c : classes) {
                System.out.println("Class Text: " + c.text());
                System.out.println("Class Attribute: " + c.attr("class=\"bds--heading-5 text-left\"")); // Get absolute URL
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/* public class GroceryList {
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
		
		int the = 0;
		String max = "";
		boolean lower = true;
		/* for(int i = 0; i < chat.size(); i++) {
			if(!(chat.get(i).equals(chat.get(i).toLowerCase()))) lower = false;
			if(chat.get(i).length() > max.length()) max = chat.get(i);
			if(chat.get(i).toLowerCase().equals("the")) the++;
			if(words.indexOf(chat.get(i).toLowerCase()) == -1) words.add(chat.get(i).toLowerCase());
		}
		System.out.println("Chat report: \n" +
						 "You used " + chat.size() + " words.\n" +
						 "You used " + words.size() + " unique words.\n" +
						 "You used \'the\' " + the + " time(s).\n" + 
						 "Your longest word was: " + max + "\n" +
						 "Your words where all lowercase? " + lower + "\n" +
						 "Condesed Chat History: \n");
	
		for(int i = 0; i < words.size(); i++) {
			System.out.print(words.get(i) + " ");
		}
		*/