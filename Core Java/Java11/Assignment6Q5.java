
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class Assignment6Q5 {
	static String file = "D:\\Ass.txt";
	static int count=1;
	static long totalPrice=0;
	public static void main(String[] args) {
		try (Scanner scanner=new Scanner(System.in)){
			Files.newBufferedWriter(Path.of(file) , StandardOpenOption.TRUNCATE_EXISTING);
			int input;
			do {
				System.out.print("Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit\n:");
				input = scanner.nextInt();
				if(input==1) {
					String input1;
					do{
						System.out.print("Insert "+count+"st Price\n:");
						int price =scanner.nextInt();
						addPrice(price);
						System.out.println("Price has been saved to the file");
						System.out.print("Do you want to enter price for more items? (Yes/No)\n:");
						input1 = scanner.next();
						count++;
					} while (input1.equals("Yes") );
				}
				else if (input==2) {
					displayPrice();
				}
			} while (input!=3);
			System.out.println("Thank You");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void addPrice(int price) throws IOException {
		String priceString = System.lineSeparator()+count+" : "+String.valueOf(price);
		Files.writeString(Path.of(file),priceString, StandardOpenOption.APPEND);
		totalPrice+=price;
	}
	public static void displayPrice() throws IOException {
		System.out.print("Prices of all items:");
		String priceString = System.lineSeparator()+"Total Amount :"+String.valueOf(totalPrice);
		Files.writeString(Path.of(file),priceString, StandardOpenOption.APPEND);
		String rString=Files.readString(Path.of(file));
		System.out.println(rString);
	}
}
