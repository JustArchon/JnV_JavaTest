package JavaTest9;

public class Num36 {
	
	public static void main(String[] args) {
		AnotherSampleClass asc = new AnotherSampleClass();
		Num36 sc = new Num36();
		sc = asc;
		System.out.println("sc " + sc.getClass());
		System.out.println("asc: " + asc.getClass());
	}
}

class AnotherSampleClass extends Num36 {}
/*

선택한 오답: B) sc: class SmapleClass
			 asc: class AnotherSampleClass
정답: D) sc: class AnotherSampleClass
	    asc: class AnotherSampleClass

이유: sc 자체가 부모의 class지만 결국 대입시에는 실제 객체, 런타임 객체의 정보를 받아오기때문에 AnotherSampleClass가 둘다 나오는게 맞다고합니다.
*/