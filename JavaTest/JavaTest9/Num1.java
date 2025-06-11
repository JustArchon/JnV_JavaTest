package JavaTest9;

public class Num1 {
	enum Machine {
		AUTO("Truck"), MEDICAL("Scanner");
		private String type;
		Machine(String type){
			this.type = type;
		}
		private void setType(String type) {
			this.type = type;
		}
		private String getType() {
			return type;
		}
	}
	public static void main(String[] args) {
		Machine.AUTO.setType("Sedan");				// line 2
		for (Machine p : Machine.values()) {
			System.out.println(p + ": "+ p.getType());
		}
	}
}

/*

선택한 오답: C) 라인 2에서 컴파일 에러
정답: B) AUTO : Sedan
	    MEDICAL: Scanner

이유: 우선 private여도 같은 class내 라면 접근이 가능합니다. 그리고 enum이지만, 결국에는 Machine의 AUTO의 setType을 접근해서 값을 변경한것이므로
Sedan에대해서 오류가나지않는다고합니다.
*/