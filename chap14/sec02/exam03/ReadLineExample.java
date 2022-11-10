package sec02.exam03;

import java.io.*;

public class ReadLineExample {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader(
			ReadLineExample.class.getResource("language.txt").getPath()
			);
		BufferedReader br = new BufferedReader(reader); // BufferedReader 보조 스트림 연결
		
		while(true) {
			String data = br.readLine();
			if(data == null) break;
			System.out.println(data);
		}
		
		br.close();

	}

}
