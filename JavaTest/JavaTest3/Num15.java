package JavaTest3;


class CustomType<T> {
	public <T> int count(T[] array, T element) {
		int count = 0;
		for (T e : array) {
			if (e.equals(element)) ++count;
		}
		return count;
	}
}
public class Num15 extends CustomType{
	public static void main(String[] args) {
		String[] words = {"banana", "orange", "apple", "lemon"};
		Integer[] numbers = { 1,2,3,4,5 };
		CustomType type = new CustomType();
		CustomType<String> stringType = new CustomType<>();
		System.out.println(stringType.count(words, "apple"));
		System.out.println(type.count(words, "apple"));
		System.out.println(type.count(numbers, 3));
	}
}

/*
선택한 오답: C) 1
			 1
			 1
정답: B) The compilation fails

이유: 제네릭에 관련되어서 CustomType<T>이
CustomType type = new CustomType();에서 아무타입없이 생성되었습니다.
이 과정에서는 
System.out.println(type.count(words, "apple"));
System.out.println(type.count(numbers, 3));
이 2개의 항목자체가 String, int를 참조하기 어렵게됩니다. 이때문에 컴파일에러가 발생합니다.
*/