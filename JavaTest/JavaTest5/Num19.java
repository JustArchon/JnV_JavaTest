package JavaTest5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Num19 {
	public static void main(String[] args) {
		Path source = Paths.get("/data/december/log.txt");
		Path destination = Paths.get("/data");
		Files.copy(source, destination);
	}
}

/*
and assuming that the file /data/december/log.txt is accessable and contains:
10-Dec-2014 - Executed successfully

선택한 오답: A) 파일이 문제없이 복사된다.
정답: D) A FileAlreadyExistsException is thrown at run time 이 뜬다.

이유: destination이 이미 /data로 설정되어있습니다. 이는 data폴더 자체가 이미 있다고 자바가 판단을 하게되며,
이쪽으로 log.txt를 복사하는 것이 아닌, 이미 data폴더를 이미파일이있다고 판단하게 되며 이때문에 이미 파일이있다는 예외가 뜨게되는겁니다.
이를 방지하기위해서 resolve log.txt를 통해서 data폴더내의 log.txt를 복사시키게 하는게 안전하다고합니다.
*/