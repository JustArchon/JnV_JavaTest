package JavaTest5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Num37 {
	public static void main(String[] args) throws IOException {
		Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home")));
		files.forEach(fName -> {
			try {
				Path aPath = fName.toAbsolutePath();
				System.out.println(fName + ":" + Files.readAttributes(
						aPath, BasicFileAttributes.class).creationTime());
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}

/*
결과는?
A) All files and directories under the home directory are listed along with their attributes.
홈 디렉토리 아래의 모든 파일과 디렉토리가 그 속성과 함께 나열된다.
B) A compilation error occurs at line n1.
n1 줄에서 컴파일 오류가 발생한다.
C) The files in the home directory are listed along with their attributes.
홈 디렉토리의 파일들이 그 속성과 함께 나열된다.
D) A compilation error occurs at line n2.
n2 줄에서 컴파일 오류가 발생한다.

선택한 오답: C) The files in the home directory are listed along with their attributes.
정답: A) All files and directories under the home directory are listed along with their attributes.

이유: Files.walk는 주어진 경로에서 재귀적으로 하위 디렉토리 및 파일까지 탐색한다고 합니다.
이에따른 creationTime을 forEach를 통해서 전부다 표시하는 것이며
이에대한 설명으로는 A)의 모든 속성과 함께 나열된다는게 맞습니다.
*/