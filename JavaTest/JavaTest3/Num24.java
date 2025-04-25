package JavaTest3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Num24 {
	public static void main(String[] args) {
		try {
			doA();
		} // line 1
	}
	private static void doA() throws IOException, IndexOutOfBoundsException {
		if (false) {
			throw new FileNotFoundException();
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
}

/*
선택한 오답: B) catch(FileNotFoundException | IndexOutOfBoundsException e) {}
정답: A) catch (IOException e) { }

이유: private static void doA() throws에서 IOException을 throws 하게 코딩되어있습니다.
IndexOutOfBoundsException는 미체크 예외이며 이는 상위에서 throw를 하지않아도 상관없다는 이야기입니다.
근데 메서드 자체에서 throws IOException을 하고있으며 체크 예외이므로 이때는 결국 catch(IOException e)를 해야 컴파일이됩니다.
*/