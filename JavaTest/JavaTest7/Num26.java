package JavaTest7;

class ImageScanner implements AutoCloseable{
	public void close() throws Exception {
		System.out.print("Scanner closed.");
	}
	public void scanImage() throws Exception {
		System.out.print("Scan.");
		throw new Exception("Unable to scan.");
	}
}

class ImagePrinter implements AutoCloseable {
	public void close() throws Exception {
		System.out.print("Printer closed.");
	}
	public void printImage() { System.out.print("Print."); }
}

public class Num26 {
	public static void main(String[] args) {
		try (ImageScanner ir = new ImageScanner();
			 ImagePrinter ip = new ImagePrinter()) {
			ir.scanImage();
			ip.printImage();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

/*

선택한 오답: C) Scan.Unable to scan
정답: A) Scan.Printer Closed.Scanner Closed. Unable to scan

이유: try with resource는 기존 try catch와 다르게 예외가 발생하면 선언한 요소들을 역순으로 우선 close()후 예외를 보여준다고합니다.
그래서 정답대로 Scan. -> 예외발생 -> ip close(Printer closed.) -> ir close(scanner closed.) -> 예외 처리
이런식으로 진행되며 A) Scan.Printer Closed.Scanner Closed. Unable to scan가 정답입니다.

*/
