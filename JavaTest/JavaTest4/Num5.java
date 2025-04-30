package JavaTest4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Num5 {
	public static void main(String[] args) {
		Path source = Paths.get("/repo/a/a.txt");
		Path destination = Paths.get("/repo");
		Files.move(source,  destination); // line 1
		Files.delete(source);			  // line 2
	}
}

/*
선택한 오답: B) A.java nio.file.NoSuchFileException is thrown on line2
정답: A) A java.nio.file.FileAlreadyExistsException is thrown on line 1.

이유: Files.move(source,  destination) 단계에서 파일을 이동시킵니다. 하지만
/repo/a/a.txt -> /repo/a.txt로 이동되면서 source에 연결된 변수가 더이상 파일이 없어지면서
NoSuchFileException 예외가 발생합니다.
*/