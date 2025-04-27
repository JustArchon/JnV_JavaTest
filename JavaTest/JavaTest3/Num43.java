package JavaTest3;

import java.io.IOException;
import java.nio.ByteBuffer;

public class Num43 {
	private String[] strings = { "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz", "0123456789"};
	public void write(String fileNmae) {
		//line 1
			for (String str : strings) {
				ByteBuffer buffer = ByteBuffer.wrap(str.getBytes());
				fileChannel.wrtie(buffer);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Num43 num43 = new Num43();
		num43.write("file_to_path");
	}
}

/*

선택한 오답: C) try (FileChannel fileChannel = new FileOutputStream(new FileChannel(fileName));) {
정답: B) try (FileChannel fileChannel = new FileOutputStream(fileName).getChannel();) {

이유: FileChannel fileChannel을 생성하는 문제입니다.
여기서 제가 선택한 오탑은 new FileChannel(fileName)은 자체가 불가능하다고 합니다.
정답인 new FileOutputStream(fileName).getChannel()에서 fileNmae을 받고서. 그것에대한 채널을 구하는 것이 정답이라고 합니다.
*/