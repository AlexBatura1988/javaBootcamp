package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class StreamReaderWriter {
	public static void readerDemo() {
		String data = "this is data I want to write\n";
		String data1 = "Adding data";
		char[] array = new char[100];
		try {
			FileInputStream file = new FileInputStream("myFiles/input.txt");
			InputStreamReader input = new InputStreamReader(file, Charset.forName("UTF8"));
			System.out.println("Is the data availlable in steram? " + input.ready());
			input.read(array);
			file.close();
			input.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void writerDemo() {
		String data = "thissssss is data I want to write\n";
		//char[] array = new char[100];

		try (FileOutputStream file = new FileOutputStream("myFiles/output1.txt");
				OutputStreamWriter output = new OutputStreamWriter(file)) {

			output.write(data);
			System.out.println("Sucsees");

			//output.close();
			//file.close();

		} catch (FileNotFoundException e) {

			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
