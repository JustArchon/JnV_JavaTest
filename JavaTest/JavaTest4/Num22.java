package JavaTest4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Num22 {
	public static void main(String[] args) throws IOException {
		Path currentFile = Paths.get("/scratch/exam/temp.txt");
		Path outputFile = Paths.get("scratch/exam/new.txt");
		Path directory = Paths.get("/scratch/");
		Files.copy(currentFile, outputFile);
		Files.copy(outputFile,  directory);
		Files.delete(outputFile);
	}
}

/*
문제: exam/temp.txt는 존재한다. 하지만 exam/new.txt, scratch/new.txt는 존재하지않는다. 결과는?
선택한 오답: B) 프로그램에서 filealreadyExsistsException 예외가발생한다.
정답: C) 프로그램에서 NoSuchFfileException 예외가 발생한다.

이유: filealreadyExsistsException은 대상에 이미 파일이 있을때 발생하는 예외라고합니다. 삭제시 파일이 없으므로 NoSuchFfileException이 발생하는것이 맞습니다.
*/