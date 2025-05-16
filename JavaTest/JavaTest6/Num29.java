package JavaTest6;

import java.io.IOException;

public class Video {
	public void play() throws IOException {
		System.out.println("Video played.");
	}
}

public class Game extends Video {
	public void play() throws Exception {
		super.play();
		System.out.println("Game played.");
	}
}

public class Num29 {
	public static void main(String[] args) {
		try {
			new Game().play();
		} catch (Exception e) {
			System.out.print(e.getClass());
		}
	}
}

/*

선택한 오답: A) Video played. Game played.
정답: B) 컴파일 에러가난다.

이유: Video는 IOException을 throw했지만 Video를 상속받은 Game은 더 넓은 Exception을 throw했습니다.
이는 부모보다 자식이 더 넓은 예외범위를 throw할수 없다는 점에서 컴파일 에러가 발생한다고 합니다.
*/