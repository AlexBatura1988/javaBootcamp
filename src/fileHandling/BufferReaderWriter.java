package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class BufferReaderWriter {
	public static void readerDemo() {
		char[] array = new char[100];

		try (FileReader file = new FileReader("myFiles/input3.txt"); BufferedReader input = new BufferedReader(file)) {
			input.read(array);
			System.out.println(array);

		} catch (FileNotFoundException e) {

			System.out.println(e);
		} catch (IOException e) {

			System.out.println(e);
		} catch (Exception e) {

			System.out.println(e);
		}
	}
	
	public static void writerDemo() {
		String data = "this is data I want to write\n";
		int age = 33;
		float money = 123.45f;
		try(PrintWriter printer = new PrintWriter("myFiles/output3.txt")) {
			printer.printf("%s age= %d and money = %f", data,age,money);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
