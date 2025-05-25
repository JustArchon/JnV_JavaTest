package JavaTest7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	List<String> list = null;
	public void printValues() {
		System.out.print(getList());
	}
	public List<String> getList() { return list; }
	public void setList(List<String> newList) { list = newList; }
}

public class Num36 {
	public static void main(String[] args) {
		List<String> li = Arrays.asList("Dog", "Cat", "Mouse");
		Test t = new Test();
		t.setList(li.stream().collect(Collectors.toList()));
		t.getList().forEach(Test::printValues);
	}
}

/*

선택한 오답: D) [Dog, Cat, Mouse]
정답: B) 컴파일 에러

이유: forEach에서 Consumer<String>형태로 내부 요소를 호출한다고합니다. 근데 printValues는 받을수 있는 인자가 존재하지 않으며,
그에따른 Consumer<String>형태의 함수에서는 printValues를 바로 호출 할 수없다고 합니다.

*/
