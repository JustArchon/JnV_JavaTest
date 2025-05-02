package JavaTest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num34 {
	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in))) {
			System.out.println("Input: ");
			String input = in.readLine();
			System.out.println("Echo: " + input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*
java Num34 HelloWorld
의 결과는?
선택한 오답: B) Input: HelloWorld
			 Echo: HelloWorld
정답: C) Input: 
		Then block until any input comes from System.in
		그리고 System.in에서 입력이 올 때까지 대기(block) 한다

이유: 코드 실행 과정에서 System.in을 받는데 이거는 args의 입력을 받는 것이 아닌, 키보드를 통해서 받은 데이터를 받는 것이며,
Input : 까지 표시 후, System.in의 입력을 받는 상태가 맞습니다.
*/