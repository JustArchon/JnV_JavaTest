package JavaTest2;

public class Num18 {

}

/*

abstract class Planet{
	protected void resolve() {
	}
	abstract void rotate();
}

class Earth extends Planet{
	private void resolve() {
	}
	private void rotate() {
	}
}

선택한 오답: B)10번째 줄의 protected를 private로 바꾼다.
정답: A)Earth의 resolve()를 protected로 바꾼다, C)Earth의 rotate()를 protected로 바꾼다.

이유: Earth가 Planet을 상속받았고, 접근자 재정의 시, 부모 접근자와 같거나 더 넓어야한다.
public > protected > default[명시x] > private
이므로, resolve는 public, protected. rotate또한 default 이상의 접근자로 수정해야합니다.

*/