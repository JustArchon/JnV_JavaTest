package JavaTest4;

import java.util.List;

public class Item {
	public String name; public int count;
	public Item(String name, int count) {
		this.name = name; this.count = count;
	}
}

public class Num40 {
	public static void main(String[] args) {
		var items = List.of(new Item("A",10), new Item("B",2), new Item("C", 12), new Item("D", 5), new Item("E", 6));
		// line 1
		System.out.println("There is an item for which the variable count is below zero.");
	}
}

/*
문제: You want to examine the items list it contains an item for which the variable count is below zero. Which code fragment at line 1 accomplish this?
당신은 items 리스트를 검사하여, count 변수가 0보다 작은 항목이 있는지 확인하고자 한다. line 1에 어떤 코드 조각을 추가하면 이 목적을 달성할 수 있는가?
선택한 오답: A) if (items.stream () .filter (i -> count < 0). findFirst() ) {
정답: D) if (items.stream () .anymatch (i -> count < 0) < 0 ) {

이유: 문제의 의도는 items 리스트 자체를 모두 검사하여 변수가 0보다 작은 항목이 있는지를 확인하는 것이므로, findFirst보다는 anymatch를 통해서 찾는것이 더 올바른 방법이라고
설명 할 수 있습니다.
*/