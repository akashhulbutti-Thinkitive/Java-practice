package filereader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleReadingOperation {
	public static void main(String[] args) {
		writeFile();
		readFile();
	}

	public static void readFile() {
		try(FileReader fr=new FileReader("newText.txt")) {
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(IOException io) {
			io.printStackTrace();
		}

	}

	public static void writeFile() {
		try(FileWriter fw=new FileWriter("newText.txt")){
			fw.write("Hello there hi how are you?");
		}catch(IOException io) {
			io.printStackTrace();
		}
	}
}
