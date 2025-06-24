package JavaTest8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Num2 {
	public static void main(String[] args) throws IOException {
		Stream<Path> files = Files.list(Paths.get(System.getProperty("user.home")));
		files.forEach(filename -> {
			try {
				Path path = filename.toAbsolutePath();
				System.out.println(filename + ":" 
						+ Files.readAttributes(path, BasicFileAttributes.class).creationTime());
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}

/*

선택한 오답: A) All files and directories under the home directory are listed along with their attributes.
정답: C) The files in the home directories are listed along with their attributes.

이유: Files.list는 walk와 다르게 해당 주어진 디렉터리의 직속된 파일, 디렉터리만 나열한다고합니다. 그래서 전체폴더를 보여준다는 A와다르게
C가 정답입니다.
*/