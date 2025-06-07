package JavaTest9;


public class Num34 {
	public static void main(String[] args) {
		String s = "hat in store";
		int x = s.indexOf("at");
		s.substring(x+3);
		x = s.indexOf("at");
		System.out.println(s + " " + x);
	}
}

/*

선택한 오답: D) at once 1
정답: E) hat in store 1

이유: s.substring(x+3); 에 대해서 substring을 했지만 s = 를 하지않았기떄문에 재대입이 진행되지 않았습니다.
그래서 "hat in store"은 유지되었고 그 과정에서 at은 hat에 있으므로 값이 1이나오게되고
D가아닌 E) hat in store가 그대로나오고 1이 추가로 나오게됩니다.
*/