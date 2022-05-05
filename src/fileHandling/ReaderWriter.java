package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriter {
	
	public static void writerDemo() {
		String data = "this is data I want to write\n";
		String data1 = "Adding data";
		try {
			Writer output = new FileWriter("myFiles/output.txt",true);
			output.write(data);
//			output.write("9");
			output.append(data1);
			
			output.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	

	public static void readerDemo() {
		char[] array = new char[100];

		try {
			Reader input = new FileReader("myFiles/input.txt");
			try {
				System.out.println("Is the data availlable in steram? " + input.ready());
				input.close();

				input.read(array);
				System.out.println(array);
			} catch (IOException e) {

				System.out.println(e);
			}
		} catch (FileNotFoundException e) {

			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
