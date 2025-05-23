package JavaTest7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num16 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileInputStream fis = new FileInputStream("version.txt");
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br  = new BufferedReader(isr);) {
			if(br.markSupported()) {
				System.out.print((char) br.read());
				br.mark(2);
				System.out.print((char) br.read());
				br.reset();
				System.out.print((char) br.read());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*

1234567890

선택한 오답: A) 121
정답: B) 122

이유: br.mark는 자신이 어디 자리를 읽을지를 정하는 메소드라고합니다. 이에따라서 br을 차례대로 읽다가
reset()하면 mark한 자리로 돌아가서 1 2 2를 읽게되고 122가 정답이된다고합니다.
*/