package JavaTest9;

import java.io.IOException;

public class Num20 {
	public static void main(String[] args) {
		try {
			// line 1
			lines.map(l -> l.toUpperCase())
				.forEach(line -> {
					try {
						Files.write(Paths.get("outputFile_to_Path"), line.getBytes(),
								StandardOpenOption.CREATE);
					} catch(IOException e) {
						e.printStackTace();
					}
				});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*
문제 You want to obtain Stream Object on reading the file. Which code inserted on line 1 will accomplish this?
파일을 읽어서 Stream<String> 객체를 얻고 싶습니다. // line 1에 어떤 코드를 삽입해야 위 작업을 수행할 수 있을까요?

선택한 오답: D) Stream<String> lines = Files.lines(INPUT_FILE_NAME);
정답: A) var lines = Files.lines(Paths.get(INPUT_FILE_NAME));

이유: Files.lines에는 Path의 경로를 전달해야하지만 오답은 Paths.get을 하지않아서 String이 전달됫기때문이라고합니다.
A가 가능한 이유또한 var는 Stream<String>의 형태를 받을수 있기 때문에 Paths.get을 추가로한 A가 정답입니다. 
*/