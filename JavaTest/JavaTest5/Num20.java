package JavaTest5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Block {
	String color;
	int size;
	Block(int size, String color){
		this.size= size;
		this.color = color;
	}
}

public class Num20 {
	public static void main(String[] args) {
		List<Block> blocks = new ArrayList<>();
		blocks.add(new Block(10, "Green"));
		blocks.add(new Block(7, "Red"));
		blocks.add(new Block(12, "Blue"));
		Collections.sort(blocks, new ColorSorter());
	}
}

/*
어떤 ColorSorter class sorts를 해야 되나요?

선택한 오답: D) class ColorSorter implements Comparator<Block> {
				public boolean compare(Block o1, Block o2) {
					return o1.color.compareTo (o2.color);
				}
			}
정답: C) class ColorSorter implements Comparator<Block> {
				public int compare(Block o1, Block o2) {
					return o1.color.compareTo (o2.color);
				}
			}

이유: 첫번째 숫자에 관련해서 sort를 해야합니다. 이 과정에서 comparator에서 비교값에 대한 결과값을 음수, 0, 양수로 반환하기때문에 int가 반환자여야 한다고합니다.
*/