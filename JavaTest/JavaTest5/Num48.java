package JavaTest5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Num48 {
	public static void main(String[] args) {
		try {
			List<String> content = Files.readAllLines(Paths.get("employee.txt"));
			content.stream().forEach(line -> {
				try {
						Files.write(
								Paths.get("allemp.txt"),
								line.getBytes(),
								StandardOpenOption.APPEND
							);
					} catch (IOException e) { System.out.println("Exception 1");}
				});
			} catch (IOException e) { System.out.println("Exception 2");
		}
	}
}


/*
Every worker is a master.
Given that the employee.txt file is accessible and the file allemp.txt does NOT exist, and the code fragment,

선택한 오답: C) The program executes, does not affect file system, and produces no output
프로그램이 실행되지만 파일 시스템에 영향을 주지 않고 아무 출력도 하지 않는다
정답: A) Exception 1

이유: allemp.txt가 없다고 문제에 제시되었기때문에, allemp.txt에 대해서 write를 실행했을때 예외처리로 Exception 1이 출력되는 것이 정답입니다.

*/