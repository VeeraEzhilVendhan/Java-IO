package coding.veera.input.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fouts = new FileOutputStream("D:\\Project-Workspaces\\Java\\Input-Output\\src\\files\\output_file.txt");
		
		String data = "sample file output";
		
		byte[] dataBytes = data.getBytes();
		
		fouts.write(dataBytes);
				
		fouts.close();

		
	}

}
