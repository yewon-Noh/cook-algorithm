### 자료구조

* 10828 - [스택](https://www.acmicpc.net/problem/10828)
* 9012 - [괄호](https://www.acmicpc.net/problem/9012)
```java
* 스택 : 나중에 들어간 것이 먼저 나옴(LIFO)

* 사용법
Stack<Integer> stack = new Stack<>();
stack.push(x);
stack.pop(); 
stack.peek();
stack.size();
stack.isEmpty();
stack.contains(x);
```
```
시간 초과
* Scanner 대신 BufferedReader, BufferedWirter를 사용하여 해결할 수 있다.
```

<br/>

* 10845 - [큐](https://www.acmicpc.net/problem/10845)
```java
* 큐 : 먼저 들어간 것이 먼저 나옴(FIFO)

* 사용법
Queue<Integer> queue = new LinkedList<>();
queue.offer(x);
queue.poll();
queue.peek();
queue.size();
queue.isEmpty();
queue.contains(x);

* 맨 마지막 값 필요시
- last 변수를 만든 후 offer(x)시, x를 last에 저장하는 방법이 있음
```

<br/>

* 1158 - [요세푸스 문제](https://www.acmicpc.net/problem/1158)

```
Queue 사용해 풀 수 있다.
```

<br/>

* 10866 - [덱](https://www.acmicpc.net/problem/10866)




