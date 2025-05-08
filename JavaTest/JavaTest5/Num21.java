package JavaTest5;

public class Canvas implements Drawable {
	public void draw() {}
}

public abstract class Board extends Canvas {}

public class Paper extends Canvas {
	protected void draw(int color) {}
}

public class Frame extends Canvas implements Drawable {
	public void resize() {}
	abstract void open();
}

public interface Drawable {
	public abstract void draw();
}
public class Num21 {}

/*

선택한 오답: B) Paper does not compile
정답: C) Frame does not compile.

이유: 일반 class의 경우는 abstract를 남겨선 안된다고합니다. 이를 방지하기위해선 frame이 abstract화되거나, open()을 구현해야한다고합니다.
Paper는 void draw()를 오버라이드 한게아닌 draw(int color)를 새롭게만든것이기때문에 접근제한자가 달라도괜찮다고합니다.
*/