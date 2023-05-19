package coding.veera.input.output;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fins = new FileInputStream("D:\\Project-Workspaces\\Java\\Input-Output\\src\\files\\input_file.txt");
		
		int i = 0;
		
		while((i=fins.read())!=-1) {
			System.out.print((char)i);
		}
		
		fins.close();
	}

}
