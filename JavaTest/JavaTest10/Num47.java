package JavaTest10;

public class Num47 {
}

/*

문제 123	Java: 1
	124 MySQL: 2
	125 Java Server Pages: 3
Which code fragment at line 1 prints the lines that contain Java from the course.txt file?
course.txt 파일에서 “Java”를 포함하는 줄만 출력하려고 한다. line 1에 들어갈 수 있는 올바른 코드 조각은 무엇인가?
선택한 오답: A) List<String> lines2 = Files.readAllLines(filePath)
			 	.filter(s -> s.contains("Java"));
			 for (String line : line2) {
			 	System.out.println(line);
			 }
정답: E) Files.lines(filePath).filter(s-> s.contains("Java"))
		.forEach(System.out::println);
 
이유: List<String>의 경우는 .filter를 사용할 수 없다고합니다. 그러므로 .filter를 쓸수있는  Stream을 반환하는
E)의 Files.lines를 통해서 파일 라인을 읽으면서 .filter를 쓰는게 정답이라고 합니다.
*/