package JavaTest9;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Num33 {
	
	public static void main(String[] args) throws InterruptedException {
		var c = new CopyOnWriteArrayList<>(List.of("1","2","3","4"));
		Runnable r = () -> {
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			c.set(3, "four");
			System.out.print(c + " ");
		};
		Thread t = new Thread(r);
		t.start();
		for (var s : c) {
			System.out.print(s + " ");
			Thread.sleep(100);
		}
	}
}

/*

선택한 오답: A) 1 2 [1,2,3, four] 3 four
정답: D) 1 2 [1, 2, 3, four] 3 4

이유: CopyOnWriteArrayList 로 복사된 리스트는 for 를 통한 순회중에는 .set으로 변경된 내용을 반영하지 않은채로 초기 복사본을 가지고
표시를 한다고합니다. 그런관계로 C가아닌 D가정답입니다.
*/