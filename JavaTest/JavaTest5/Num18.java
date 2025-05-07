package JavaTest5;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Num18 {
	public static void main(String[] args) {
		Path path1 = Paths.get("/app/./sys/");
		Path res1 = path1.resolve("log");
		Path path2 = Paths.get("server/exe");
		Path res2 = path2.resolve("/readme/");
		System.out.println(res1);
		System.out.println(res2);
	}
}

/*

선택한 오답: D) /app/./sys/log
			 /server/exe/readme
정답: C) /app/./sys/log
		/readme

이유: resolve 메소드는 경로가아닌 단순 문자가 들어올경우 뒷 경로에 붙이는 역할을 한다고합니다.
하지만 /readme/ 이런식으로 경로로시작하게된다면 기존 경로를 무시하고 입력된 경로로 재설정한다고합니다.
*/