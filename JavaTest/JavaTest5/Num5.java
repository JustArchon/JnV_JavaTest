package JavaTest5;

public class Foo<K, V>{
	private K key;
	private V value;
	
	public Foo(K key, V value) {this.key = key; this.value = value;}
	public static <T> Foo<T, T> twice(T value) { return new Foo<T, T>(value, value);}
	public K getKey() { return key; }
	public V getValue() {return value;}
}

public class Num5 {
	public static void main(String[] args) {}
}

/*
Which option fails?
어떤 옵션이 실패하나요?

선택한 오답: B) Foo<String, String> pair = Foo.<String>twice("Hello World!");
정답: C) Foo<Object, Object> percentage = new Foo<String, Integer>("Steve", 100);

이유: 제네릭 파라미터의 경우는 타입이 서로 완전히 일치해야 한다고합니다. 그래서 String Integer가 Object의 자식이지만, 제네릭의경우는
오류가 발생한다고합니다.
*/