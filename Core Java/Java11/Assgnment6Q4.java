import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Assgnment6Q4 {

	public static void main(String[] args) {
		var file = "D:\\Student_list.txt";
		try {
			String rString=Files.readString(Path.of(file));
			//System.out.println(rString.trim());
			rString.lines().filter(p->!p.equals("")).forEach(p->System.out.println(p));
			System.out.println(rString.lines().filter(p->!p.equals("")).count());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
