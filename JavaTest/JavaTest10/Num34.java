package JavaTest10;

import java.util.Collection;
import java.util.Map;

public class X {
	private Collection collection;
	public void set(Collection collection) {
		this.collection = collection;
	}
}

public class Y extends X {
	public void set(Map<String, String> map) {
		super.set(map); //line1
	}
}

public class Num34 {
	public static void main(String[] args) {
	}
}

/*
어떤것이 Y class 컴파일을 할수있게하나요?

선택한 오답: A) map.forEach((k,v) -> set(v)));
		  C) super.set(List<String> map);
정답: B) set(map.values());
	 D) super.set(map.values());

이유: set(Map<String, String> map)이 X에 set을 오버로딩하고있습니다. 하지만 Collection은 Map의 서브타입이 아닌관계로
map.values()를 불러서 Collection<String>을 반환시켜야한다고합니다.
*/