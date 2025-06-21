package JavaTest12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Num6 {
	public static void main(String[] args) throws IOException {
		Path currentFile = Paths.get("/scratch/exam/temp.txt");
		Path outputFile = Paths.get("/scratch/exam/new.txt");
		Path directory = Paths.get("/scratch/");
		Files.copy(currentFile, outputFile);
		Files.copy(outputFile, directory);
		Files.delete(outputFile);
	}
}

/*
The /scratch/exam/temp.txt file exists. the /scratch/exam/new.txt and /scratch/new.txt files do not exist. What is the result?
/scratch/exam/temp.txt 파일은 존재합니다. /scratch/exam/new.txt 및 /scratch/new.txt 파일은 존재하지 않습니다. 결과는 어떻게 될까요?

선택한 오답: C) NoSuchFileException이 발생한다.
정답: B) FileAlreadyExistsException이 발생한다.

이유: 실제 실행 결과, Exception in thread "main" java.nio.file.FileAlreadyExistsException: \scratch
가 발생했으며, 이는 Files.copy(outputFile, directory); 에서 directory 자체를 파일 자체로 간주하다보니 결국
이미 이 파일은 존재한다라는 결론을 내게됩니다. 그래서 해결방법으로는 Files.copy(outputFile, directory.resolve(outputFile.getFileName()))
이런식으로 resolve를 통한 추가경로를 붙여주지않는이상 디렉터리 자체를 이미존재하는 파일로 간주한다고합니다.
그래서 B 가 정답입니다.
예외적으로 NoSuchFileException 뜨는경우는 단순 이클립스에서 The /scratch/exam/temp.txt file exists.라는 조건을무시한채로 실행하면
Exception in thread "main" java.nio.file.NoSuchFileException: \scratch\exam\temp.txt
이뜨기도합니다.
*/