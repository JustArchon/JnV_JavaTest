package JavaTest3;

import java.util.List;
import java.util.stream.Stream;

public class Num42 {
	public static void main(String[] args) {
		List widgets = List.of(new Widget("Basic Widget", 25.00),
				new Widget("Enhanced Widget", 32.99),
				new Widget("Luxary Edition Widget", 59.99));
		Stream widgetStream = widgets.stream();
		widgetStream.filter(a -> a.getPrice() > 35)
						.forEach(System.out::println);
	}
}

/*

선택한 오답: B) Replace line 5 with widgetStream.filter((Widget a) -> a.getPrice() > 35)
		  D) Replace line 1 with List<Widget> widgetStream = widgets.stream();
정답: A) Replace line 5 with widgetStream.filter(a -> ((Widget)a).getPrice() > 35)
	 C) Replace line 4 with Stream<Widget> widgetStream = widgets.stream();

이유: List widgets에서 데이터타입을 지정하지 않으면 List<Object>로 선언된다고합니다.
이 과정에서 list에는 Object형태로 담기게되고
widgetStream.filter(a -> a.getPrice() > 35)에서
a에 대해서 (Widget)a 형태로 강제로 형변환을 해줘서 widget내의 메소드를 사용하거나
Stream<Widget> widgetStream 으로 변경해서 Stream 자체에서 Widget형태로 변화되게 바꾸는게 정답이라고합니다.
*/