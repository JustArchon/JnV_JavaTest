package JavaTest10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String input = br.readLine();
			System.out.println("Input string was: " + input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*

선택한 오답: A) System.out is the standard output stream. The stream is open only when System.out is called
System.out은 표준 출력 스트림이다. 이 스트림은 System.out이 호출될 때만 열려 있다.
정답: D) System.in is the standard input stream. The stream is already open.
System.in은 표준 입력 스트림이다. 이 스트림은 이미 열려 있다.

이유: System.in out의 경우는 표준 입 출력 스트림이라고 합니다. 그러다보니까 항상 열려있으며, 따로 System.out을 호출하거나 열필요가 없는 요소라합니다.
*/