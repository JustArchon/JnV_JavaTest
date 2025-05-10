package JavaTest5;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Num47 {
	public static void main(String[] args) {
		Path file = Paths.get("courses.txt");
		// line n1
	}
}

/*
Assume the courses.txt is accessible.
Which code fragment can be inserted at line n1 to enable the code to print the content of the courses.txt file?
courses.txt 파일에 접근할 수 있다고 가정했을 때,
line n1 위치에 어떤 코드 조각을 넣어야 이 파일의 내용을 출력할 수 있을까요?

선택한 오답: B) Stream<String> fc = Files.readAllLines(file);
			 fc.forEach(s->System.out.println(s));
정답: D) Stream<String> fc = Files.lines(file);
		fc.forEach(s->System.out.println(s));

이유: Files.readAllLines()의 경우는 List<String>으로 반환합니다. 그러므로 Stream형식으로 만들어진 fc에는 반환할수없으며
이때는 Lines로 한줄씩 읽어서 표시하는것이라고 합니다.
*/