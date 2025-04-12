package JavaTest1;

class LogFileException extends Exception {}
class AccessViolationException extends RuntimeException {}

public class Num34 {
	public static void main(String[] args) throws LogFileException{
		Num34 obj = new Num34();
		try {
			obj.open();
			obj.process();
		} catch (Exception e) {
			System.out.println("Completed");
		}
	}
	public void process() {
		System.out.println("Processed");
		throws new LogFileException();
	}
	public void open() {
		System.out.println("Opened.");
		throws new AccessViolationException();
	}
}

/*
선택한 오답: C) 2번라인에 throws LogFileException with throws AccessViolationExcepion으로 변경한다.
정답: B) 12번라인에 throws LogFileException을 추가한다.

이유: 주어진 클래스에따르면 AccessViolationException은 RuntimeException으로 선언했으므로
미체크 예외가 됩니다. 이런경우 throws를 더 적을필요가 없습니다.
하지만 LogFileException은 체크 예외이므로, 위에 throws를 더 적어야합니다.
*/