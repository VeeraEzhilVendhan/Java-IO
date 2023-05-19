package coding.veera.input.output;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fins = new FileInputStream("D:\\Project-Workspaces\\Java\\Input-Output\\src\\files\\input_file_bos.txt");
		
		BufferedInputStream bins = new BufferedInputStream(fins);
		
		int i = 0;
		
		while((i=bins.read())!=-1) {
			System.out.print((char)i);
		}
		
		bins.close();
		
		fins.close();
		
	}
}
