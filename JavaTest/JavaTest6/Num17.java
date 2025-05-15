package JavaTest6;

import java.nio.file.Path;
import java.nio.file.Paths;

	public class Num17 {
		public static void main(String[] args) {
			Path path1 = Paths.get("/software/././sys/readme.txt");
			Path path2 = path1.normalize();
			Path path3 = path2.relativize(path1);
			System.out.println(path1.getNameCount());
			System.out.println(" : " + path2.getNameCount());
			System.out.println(" : " + path3.getNameCount());
		}
	}
	
	/*
	
	선택한 오답: B) 6:5:6
	정답: A) 5:3:6

이유: 우선 .getNameCount는 /를 세지않는다고합니다.
여기서 첫번째로는 software, . , . , sys, readme.txt를 세서 5
normalize는 . 을 없애서 software, sys, readme.txt 3개
relativize는 from to 상대경로를 구하는것이므로 / -> readme.txt 전부세서 6이라고합니다.
5:3:6이 나옵니다.
*/