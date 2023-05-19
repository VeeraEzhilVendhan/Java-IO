package coding.veera.input.output;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		
		String dataInput = "sample input for byte array input stream";
		
		byte[] dataBytes = dataInput.getBytes();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(dataBytes);
		
		int i = 0;
		
		while((i=bais.read())!=-1) {
			System.out.print((char)i);
		}
		
		bais.close();
	}

}
