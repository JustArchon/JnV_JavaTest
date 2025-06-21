package JavaTest12;

@interface Resource {
	String name();
	int priority() default 0;
}

/* Loc1 */
public class Num18 {
	public static void main(String[] args) {
	}
}

/*
Which two annotations may be applied to Loc1 in the code fragment?

선택한 오답: C) @Resource(name = "Customer1", priority = 100)
		  D) @Resource(name = "Customer1")
정답: D) @Resource(name = "Customer1")
	 E) @Resource

실제정답: C) @Resource(name = "Customer1", priority = 100)
		D) @Resource(name = "Customer1")

이유: @interface Resource 에서 String name()은 default값이 없이 생성되었습니다. 그러다보니까 무조건 @Resource를 사용하기위해서는
name을 지정해줘야 오류가나지않습니다. 그에반에 정답은 E) @Resource를 고르고잇지만 이는 실제 컴파일 시에는 오류가 뜹니다.
그래서 C, D가 정답입니다.
*/