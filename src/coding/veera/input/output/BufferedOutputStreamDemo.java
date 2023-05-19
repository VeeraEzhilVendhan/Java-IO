package coding.veera.input.output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fouts = new FileOutputStream("D:\\Project-Workspaces\\Java\\Input-Output\\src\\files\\output_file_bos.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(fouts);
		
		String data = "sample data for buffered output stream";
		
		byte[] dataBytes = data.getBytes();
		
		bos.write(dataBytes);
		
		bos.flush();
		
		bos.close();
		
		fouts.close();
		
	}
}
