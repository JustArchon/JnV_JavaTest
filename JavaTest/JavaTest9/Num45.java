package JavaTest9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Num45 {	
	public static void main(String[] args) {
		try {
			Path path = Paths.get("/u01/work/filestore.txt");
			boolean result = Files.deleteIfExists(path);
			if (result) System.out.println(path + " is deleted.");
			else System.out.println(path + " is not deleted.");
		} catch (IOException e) {
			System.out.println("Exception");
		}
	}
}

/*
파일은 해당경로에 존재하지않습니다. 결과는?

선택한 오답: A) 컴파일오류
정답: B) /u01/work/filestore.txt is not deleted

이유: Path에 없는 파일의 경로를 넣는다 해도 컴파일 에러가 발생하지는 않는다고합니다. 컴파일 에러대신 웬만해선 IOException등의 예외가 발생한다하며,
컴파일오류는 예외처리 등을 하지않았을때 발생한다고합니다.
파일이 없으므로 B인 not deleted가 뜬다는게 정답입니다.
*/