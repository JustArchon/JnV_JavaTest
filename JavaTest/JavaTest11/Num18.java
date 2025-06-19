package JavaTest11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Num18 {
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

선택한 오답: D) A copy of /scratch/exam/new.txt exists in the /scratch directory and /scratch/exam/new.txt is deleted
/scratch/exam/new.txt의 복사본이 /scratch 디렉터리에 생성되고, /scratch/exam/new.txt는 삭제된다.
정답: C) The program throws a NoSuchFileException.
프로그램은 NoSuchFileException을 발생시킨다.

이유: 기존의 디렉터리에 copy명령을 붙일경우 일반적으로는 디렉터리밑에 파일명을 붙여서 복사시켜줄려고 생각하지만,
Files.copy의 경우는 디렉터리자체를 열려고 시도하다보니, 해당파일은 존재하지않는다고 예외가 발생할수있다고합니다.
그래서 D가아닌 C가정답입니다.
*/