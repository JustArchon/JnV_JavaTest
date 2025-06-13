package JavaTest10;

import java.util.function.BiFunction;

public class Pair<T> {
	final BiFunction<T, T, Boolean> validator;
	T left = null;
	T right = null;
	private Pair() {
		validator = null;
	}
	Pair(BiFunction<T, T, Boolean> v, T x, T y) {
		validator = v;
		set(x, y);
	}
	void set(T x, T y) {
		if(!validator.apply(x, y)) throw new IllegalArgumentException();
		setLeft(x);
		setRight(y);
	}
	void setLeft(T x) {
		left = x;
	}
	void setRight(T y) {
		right = y;
	}
	final boolean isValid() {
		return validator.apply(left, right);
	}
}

public class Num38 {
	public static void main(String[] args) {
	}
}

/*
It is required that if p instanceof Pair then p.isValid() returns true, Which is the smallest set of visibvility changes to insure this requirement is met?
p가 Pair의 인스턴스일 경우, p.isValid()가 true를 반환해야 합니다. 이 요구사항을 충족하기 위해 필요한 가장 최소한의 접근 제한자 변경은 무엇인가요?

선택한 오답: B) left and right must be private 
정답: C) isValid must be public

이유: 문제에서 요구하는건 p.isValid()시 true를 반환해야 하는것이었으며, 가장최소한의 접근자 변경은 결국 isValid를 public을 통해 공개하는것이 최소한의 접근제한자 변경이라고합니다.
그래서 C가 정답입니다.
*/