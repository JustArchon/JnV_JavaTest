package JavaTest1;

import java.util.ArrayList;
import java.util.List;

public class Num8 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		
		if (names.remove("Bran")) {
			names.remove("Jon");
		}
		System.out.println(names);
	}
}

/*


선택한 오답: B) [Robb, Rick]
정답: A) [Robb, Rick, Bran]
컴파일결과 : [Robb, Rick, Bran]

이유: if(names.remove("Bran"))을 시도하는 과정에서는 첫 번째 요소 Bran이 삭제된 이후로 Jon을 삭제한다고 명령했기때문에,
3번째에 있던 Bran은 유지된 채로 print됩니다.
*/