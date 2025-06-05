package JavaTest9;

public class Num13 {
	private int sum;
	public int compute() {
		int x = 0;
		while(x<3) {
			sum += x++;
		}
		return sum;
	}
	public static void main(String[] args) {
		Num13 t = new Num13();
		int sum = t.compute();
		sum = t.compute();
		t.compute();
		System.out.println(sum);
	}
}

/*

선택한 오답: D) 6
정답: C) 3
실제 정답?: D) 6

이유: t를 생성 후 int sum 생성에 private int sum에 3이 더해집니다. 그리고 새로생성된 sum에 3이 대입되고 그이후 다시 기존 sum에대해서 3이추가적으로 대입됩니다.
그래서 6이되며 최종적으로 표시되는 지역변수 sum은 6이라고 합니다.
*/