package JavaTest9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Num9 {
	public static void main(String[] args) {
		Path file = Paths.get("courses.txt");
		// line n1
	}
}

/*
문제: courses.txt는 엑세스 가능한 상태입니다.
어떤 항목이 courses.txt를 읽을수 있게하나요?

선택한 오답: A) List<String> fc = Files.list(file);
			 fc.stream().forEach(System.out::println);
정답: C) List<String> fc = Files.readAllLines(file);
		fc.stream().forEach(System.out::println);

이유: Files.list는 파일을 읽는 역할이 아닌, 디렉토리의 하위 항목 목록을 반환한다고합니다.
이에 List<String>을 통해서 해당 txt를 모두 읽는 readAllLines를 함으로써 전부 읽은뒤
한줄씩 stream으로 출력함으로써 txt를 출력할수있다고합니다.
대신 Stream<String>으로는 Files.lines를 써야한다고합니다.
*/