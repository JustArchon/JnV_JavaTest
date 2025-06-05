package JavaTest9;

public class Num6 {
	public static void main(String[] args) {
		StringBuilder txt1 = new StringBuilder("PPQRRRSTT");
		int i = 0;
		a:
		while (i < txt1.length()) {
			char x = txt1.charAt(i);
			int j = 0;
			i++;
			b:
			while(j < txt1.length()) {
				char y = txt1.charAt(j);
				if(i !=  j && y == x) {
					txt1.deleteCharAt(j);
					// line 1
				}
				j++;
			}
		}
		System.out.println(txt1);
	}
}

/*
문제: 라인 1에 무얼넣으면 PRRT가 나오는건가요?

선택한 오답: A) a-;
정답: C) break b, E) continue a;

이유: 문자를 하나만남기고 모두 지우라는 작업이라고 합니다, 처음에 i가 순회하면서 P를 먼저 체킹하기 시작합니다. 처음에 P는 패스되고 다음 P가 삭제된 후 break b로 j의 순회를
멈추고 다시 i부터 순회하거나 a라인의 모든 작업을 다시시작시키는 continue a를 통해서 P를 하나만남기고, Q, R, T 전부를 모두 중복을 제거하는 방향으로 가는게
정답이라고 합니다. 또한 Q,S는 중복으로 삭제되지 않는 점에서는 글자를 삭제하면서 index가 점프하게되면서 중복삭제된 P, RR (RRR -R) T 이런식으로 남게된다고합니다.
*/