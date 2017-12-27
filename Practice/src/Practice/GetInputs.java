package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetInputs {

	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter Some text");
		String text = input.nextLine();
		System.out.println(text);
		input.close();*/
		
//		Reading and Writing files
		File file = new File("mytextq.txt");
		Scanner fileInput = null;
		try {
			fileInput = new Scanner(file);
			while(fileInput.hasNextLine()) {
				String line = fileInput.nextLine();
				System.out.println(line);
			}
			fileInput.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
//			e.printStackTrace();
		}
	}
	
	

}
