package JavaTest7;

import java.io.File;
import java.io.IOException;

public class Num28 {
	public void recDelete(String dirName) throws IOException {
		File[] listOfFiles = new File(dirName).listFiles();
		if (listOfFiles != null && listOfFiles.length > 0) {
			for (File aFile : listOfFiles) {
				recDelete(aFile.getAbsolutePath());
			
			} else {
				if (aFile.getName().endWith(".class"))
					aFile.delete();
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}

/*
문제 Assume that Projects contains subdirectories that contain .class files and is passed as an argument to recDelete() method when it is invoked
Projects 디렉토리는 여러 하위 디렉토리(subdirectories) 를 포함하고 있고, 그 안에 .class 파일들이 있습니다. 이 Projects 경로가 recDelete() 메서드에 인자로 전달되었을 때, 이 메서드는 어떤 동작을 할까요?

선택한 오답: B) The method deletes the .class files of the Projects directory only
			 이 메서드는 Projects 디렉토리 안에 있는 .class 파일만 삭제한다. 
정답: A) The method deletes all the .class files in the Projects directory and its subdirectories.
		이 메서드는 Projects 디렉토리와 모든 하위 디렉토리에 있는 .class 파일을 삭제한다.

이유: listOfFiles를 순회하면서 디렉토리일 경우 경로값을 반환하고, 그에따른 모든 파일을 삭제하는것이므로, recDelete(aFile.getAbsolutePath());에대해서 경로값에대해서
계속해서 주입되므로 A가정답입니다.

*/
