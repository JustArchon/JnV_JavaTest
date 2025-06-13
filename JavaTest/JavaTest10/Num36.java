package JavaTest10;

public class Num36 {
	public static void main(String[] args) {
	}
}

/*
어떤 코드가 컴파일 되나요?
선택한 오답: C) Comparator<> comparator = new Comparator<Integer>() {
	public int compare(Integer i, Integer j) {
		return i..compareTo(j)
	}
}
정답: D) Comparator<Integer> comparator = new Comparator<Integer>() {
	public int compare(Integer i, Integer j) {
		return i..compareTo(j)
	}
}

이유: 좌측에는 반드시 어떤 타입이 올지에 대해서 반드시 명시해야한다고 합니다. 그러므로 D)가 정답입니다.
*/