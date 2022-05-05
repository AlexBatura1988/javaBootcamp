package ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class exRedWrite {

	public static void getWordCount() throws IOException {

		String line;
		int count = 0;

		FileReader file = new FileReader("myFiles/ex1.txt");
		BufferedReader br = new BufferedReader(file);

		while ((line = br.readLine()) != null) {

			String words[] = line.split(" ");

			count = count + words.length;
		}

		System.out.println("Number of words present in given file: " + count);
		br.close();
	}

	public static void getLineCounts() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("myFiles/ex1.txt"));
		int lines = 0;
		try {
			while (reader.readLine() != null)
				lines++;
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Number of lines present in given file: " + lines);
		reader.close();

	}

}
