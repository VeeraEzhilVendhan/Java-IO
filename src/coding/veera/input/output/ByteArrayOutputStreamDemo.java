package coding.veera.input.output;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout1 = new FileOutputStream("D:\\Project-Workspaces\\Java\\Input-Output\\src\\files\\output_file_byteaos_1.txt");
		
		FileOutputStream fout2 = new FileOutputStream("D:\\Project-Workspaces\\Java\\Input-Output\\src\\files\\output_file_byteaos_2.txt");

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		String data = "sample data for byte array output stream";
		
		byte[] dataBytes = data.getBytes();
		
		baos.write(dataBytes);
		
		baos.writeTo(fout1);
		baos.writeTo(fout2);
		
		baos.close();
	}

}
