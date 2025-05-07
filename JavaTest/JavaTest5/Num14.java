package JavaTest5;

public class Num14 {}

/*
문제: Assume customers.txt is accessible and contains multiple lines.
Which code fragment prints the contents of the customers.txt file?
customers.txt 파일이 접근 가능하고 여러 줄의 데이터가 있다고 가정할 때,
customers.txt 파일의 내용을 출력하는 코드 조각은 무엇인가?

선택한 오답: A) Stream<String> stream = Files.find(Paths.get("customers.txt"));
			 stream.forEach((String c) -> System.out.println(c));
정답: D) Stream<String> stream = Files.lines(Paths.get("customers.txt"));
			 stream.forEach(c -> System.out.println(c));

이유: Files.find는 Paths의 경로를 찾아서 반환하는 메소드라고 합니다. 문제는 txt를 읽고 출력하는 것이므로, Files.lines가 정답이라고합니다.
이는 파일을 한줄씩 읽어서 표시해준다고합니다.

*/
