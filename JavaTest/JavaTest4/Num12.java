package JavaTest4;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Num12 {
	public static void checkConfiguration(String fileName) {
		File file = new File(fileName);
		if(!file.exists()) {
			throw new Error("Fatal error: Cconfiguration file, " + fileName + ", is missing.");
		}
	}
	public static void main(String[] args) {
		checkConfiguration("App.config");
		System.out.println("Configuration is OK");
	}
}

/*
선택한 오답: B) 컴파일 오류
정답: C) main에서 예외발생, "Fatal error: Cconfiguration file App.config, is missing."

이유: Error는 미체크 예외에 해당하며, throw를 안해도 괜찮다고합니다.
*/