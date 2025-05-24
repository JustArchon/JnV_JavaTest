package JavaTest7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Num34 {
	public static void main(String[] args) {
		Stream<Path> paths = Stream.of(Paths.get("data.cod"), Paths.get("data.txt"), Paths.get("data.xml"));
		paths.filter(s -> s.toString().endsWith("txt"))
			.forEach(s -> {
				try {
					Files.readAllLines(s).stream()
						.forEach(System.out::println); // line1
				} catch (IOException e) {
					System.out.println("Exception");
				}
			});
	}
}

/*

선택한 오답: C) line n1에 대해서 컴파일 오류가난다.
정답: A) 프로그램은 data.txt에 대한 내용을  표시한다.

이유: 프로그램은 s에 대해서 끝이 txt로끝나는 것에 대해서 필터링하며, 이는 data.txt가 나오게됩니다.
이에 data.txt의 내용을 표시해주게되며,
C를 선택한 이유는 문제지에서 .forEach(System.out::println); 를 forEach(System.out::println);라고 적혀있었으며,
실제로 . 이없으면 stream()에서 오류가납니다.

*/
