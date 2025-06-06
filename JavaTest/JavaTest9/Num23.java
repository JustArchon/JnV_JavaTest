package JavaTest9;

public class Num23 {
	private int num = 1;
	private int div = 0;
	public void divide() {
		try {
			num = num / div;
			System.out.print("Exception");
		}
		catch (ArithmeticException e) { num = 100; }
		catch (Exception e) { num = 200; }
		finally { num = 300; }
		System.out.print(num);
	}
	public static void main(String[] args) {
		Num23 test = new Num23();
		test.divide();
	}
}

/*

선택한 오답: D) 100
정답: A) 300

이유: try catch시에는 catch가 발생시 finally까지 반영된다고 합니다. 그래서 실제로 1 / 0 에서 num = 100이 반영되었고,
finally까지 반영시 300이 되고 그에맞춰서 num 300이 프린트됩니다.
*/