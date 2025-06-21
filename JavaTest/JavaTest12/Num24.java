package JavaTest12;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Num24 {
	public static void main(String[] args) {
		String originalPath = "data\\projects\\a-project\\..\\..\\another-project";
		Path path = Paths.get(originalPath);
		System.out.println(path.normalize());
	}
}

/*

선택한 오답: B) data\projects\a-project\another-project
정답: A) data\another-project

이유: path.normalize()는 경로간의 '..'즉 상위폴더로 올라가라는 점을 정리해서 보여준다고합니다.
그래서 '..'이 처리된 data\another-project 결과값이 나오게됩니다.
*/