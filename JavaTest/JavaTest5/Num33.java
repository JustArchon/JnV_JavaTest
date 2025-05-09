package JavaTest5;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Num33 {
	public static void main(String[] args) {
		int i;
		char c;
		try (FileInputStream fis = new FileInputStream ("course.txt");
					InputStreamReader isr = new InputStreamReader(fis);) {
			while (!isr.close()) { // line 1
				isr.skip(2);
				i = isr.read();
				c = (char)i;
				System.out.println(c);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
course.txt
Course::Java

선택한 오답: B) ueJa
정답: D) 라인 n1에서 컴파일 오류

이유: !isr.close()는 void를 반환하는 메소드입니다. 즉, boolean이 필요한 while에서 close()를썻으므로 라인1번에서 컴파일오류가 나는게 정답입니다.
*/