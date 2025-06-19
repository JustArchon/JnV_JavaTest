package JavaTest11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Num25 {
	public static void main(String[] args) throws IOException {
		Path source = Paths.get("/repo/a/a.txt");
		Path destination = Paths.get("/repo");
		Files.move(source, destination); // line 1
		Files.delete(source);			 // line 2
	}
}

/*

Assuming the source file and destination folder exist what is the result?
소스 파일과 대상 폴더가 존재한다고 가정할 때, 결과는 무엇인가?

선택한 오답: B) line 2에서 NoSuchFileException 오류가난다.
정답:	A) FileAlreadyExistsException 예외가 line 1에서 난다. 

이유: Files.move 과정에서 /repo/a.txt를 시도하게되는데 파일의 경로 자체가 /repo/a/ 인게 문제가된다고합니다.
이에따라서 a 디렉터리가 이미 파일이 있다고 판단하게되고, move시에 이미파일이 있을경우 StandardCopyOption.REPLACE_EXISTING 옵션이 없을경우
이미 파일이 있다는 예외가 발생한다고합니다.
*/