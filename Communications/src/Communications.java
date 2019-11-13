import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Communications {
	private static FileReader reader;
	private static BufferedReader br;

	public static void main(String[] args) {
		try {
			reader = new FileReader("communications.txt");
			br = new BufferedReader(reader);
			String readLines = br.readLine();
			
			int lines = Integer.parseInt(readLines);
			for(int x = 0; x < lines; x++) {
				String message = br.readLine();
				checkLength(message);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void checkLength(String message) {
		String length = message.substring(10,13);
		int vLength = Integer.parseInt(length);
		
	}
	/*
	public static void checkValue(int lines) {
		int ascii;
		for(int x = 1;x<=lines;x++) {
			try {
				String message = br.readLine();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	*/

}
