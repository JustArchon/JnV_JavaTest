package JavaTest6;


public class Num1 {
	public static void main(String[] args) {
		//line n1
		stream.forEach(s-> System.out.println(s));
	}
}

/*
/company/emp/info.txt
/company/emp/benefits/b1.txt

Which code fragment can be inserted at line n1 to enable the code to print only /company/emp?
코드의 line n1 위치에 어떤 코드 조각을 삽입하면 /company/emp만 출력되게 할 수 있을까요?

선택한 오답: D) Stream<Path> stream = Files.list(Paths.get("/company/emp"));
정답: B) Stream<Path> stream = Files.find(Paths.get("/company"), 1, (p, b) -> b.isDirectory(), FileVisitOptions.FOLLOW_LINK);

이유: 문제 자체가 /company/emp라는 emp 디렉터리만 출력되게 하시오라는 문제였으며, 기존에 선택한 오답은 emp내의 소속되어있는 info.txt와 benefits 디렉터리가 나온다고합니다.
이에 정답은 company폴더에서 isDirectory()를 통한 하위 1단계요소만 서치후 디렉터리만 추출해서 emp폴더만을 표시하는 B)가 정답이라고합니다.
*/