package JavaTest5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Num46 implements Runnable{
	String fName;
	public Num46(String fName) { this.fName = fName; }
	public void run() {System.out.println(fName);}
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		Stream<Path> listOfFiles = Files.walk(Paths.get("Java Projects"));
		listOfFiles.forEach(line -> {
			executor.execute(new Num46(line.getFileName().toString()));
		});
		executor.shutdown();
		executor.awaitTermination(5, TimeUnit.DAYS); // line n2
	}
}

/*

선택한 오답: C) The program prints file names sequentially
프로그램은 파일 이름을 순차적으로 출력한다
정답: B) The program prints file names concurrently
프로그램은 파일 이름을 동시(병렬)로 출력한다

이유: Executors.newCachedThreadPool은 동시에 여러 쓰레드를 생성하여 작업을 병렬로 처리한다소합니다.
즉, 병렬로 처리하는만큼 동시에 출력된다가 정답이며,
awaitTermination는 모든 스레드가 종료될때까지 기다리는 메소드라고합니다.
awaitTermination

sequentially: 순차
concurrently: 동시(병렬)
*/