package JavaTest6;

public class Canvas implements Drawable{
	public void draw() {}
}

public abstract class Board extends Canvas {}
public class Paper extends Canvas {
	protected void draw(int color) {}
}

public class Frame extends Canvas implements Drawable {
	
}

public interface Drawable {
	public abstract void draw();
}


public class Num16 {
	public static void main(String[] args) {
		
	}
}

/*

선택한 오답: A) Board 가 컴파일이되지않는다.
정답: E) 전부 정상적으로 컴파일된다.

이유: Board는 Canvas를 상속받았으며, Canvas는 이미 Drawable을 받아서 구현을 끝냈으므로 따로 구현을 할 필요가없다고합니다.
*/