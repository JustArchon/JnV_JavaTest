package JavaTest7;

public class Num25 {}

/*
문제: Which two statements are true about the Fork/Join Framework?
다음 중 Fork/Join Framework에 대해 올바른 설명 두 가지는 무엇인가요?

A) the recursiveTask subclass is used when a task does not need to return a result
B) the fork/join framework can help you take advantage of multicore hardware.
C) the fork/join framework implements a work-staling  algorithm
D) the fork/join solution when run on multicore hardware always performs faster than standard sequential solution

A) RecursiveTask 서브클래스는 작업이 결과를 반환할 필요가 없을 때 사용된다
B) Fork/Join 프레임워크는 멀티코어 하드웨어의 성능을 활용하는 데 도움이 된다
C) Fork/Join 프레임워크는 워크 스틸링(work-stealing) 알고리즘을 구현한다
D) Fork/Join 솔루션은 멀티코어 환경에서 항상 순차적 실행보다 빠르다

선택한 오답: B), D)
정답: B), C)

이유: fork/join 프레임워크는 자바 7에서 소개된 효율적인 병렬처리 프레임워크라하며
여기서 D가 틀린 이유는 작업량이 적거나 병렬화오버헤드등의 이유로 병렬처리가 어려우면 오히려 순차보다 느려질가능성이 있기때문에
항상 빠른것은 아니며, 워크 스틸링 알고리즘은 각 스레드가 작업 큐를 가지고있으며, 다른 스레드가 놀고잇으면 그 일을 뺏어와서 실행시키는 구조로서
병렬처리의 포크 조인 프레임워크의 설명에 알맞습니다.

*/
