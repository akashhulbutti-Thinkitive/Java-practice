package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileReader fr=new FileReader("test.txt");
		prop.load(fr);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("role"));
		System.out.println(prop.getProperty("gender"));

	}

}
