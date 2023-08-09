package day7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {
	public static void main(String args[]) {
		FileReader reader = null;
		BufferedReader br = null; // 한 행씩 읽는 reader
								// 파일을 여는 수행동작은 없기 때문에 FileReader도 있어야한다.
		try {
			reader = new FileReader("c:/iotest/output.txt");
			br = new BufferedReader(reader);
			while (true) {
				String data = br.readLine();
				if (data == null)
					break;
				System.out.println(data);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				br.close();
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
