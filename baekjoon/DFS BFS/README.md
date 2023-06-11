### DFS/BFS

> 참고 문제집 <br/>
> https://www.acmicpc.net/workbook/view/1983

* 1260 - [DFS와 BFS](https://www.acmicpc.net/problem/1260)

```
그래프 구현 방법
   1. 인접행렬
      - NxN의 행렬로(N은 노드 개수)로 표시하는 것
      - 0, 1의 노드가 연결되어 있는 경우, array[0][1] = 1로 표시

   2. 인접리스트
      - 연결된 노드들의 리스트로 표시하는 것
      - 0, 1의 연결을 확인하고 싶은 경우 list[0] 리스트를 순회하여 1번이 있는 지 확인

DFS
* 깊이 우선 탐색
* 루트 노드(혹은 다른 임의의 노드)에서 시작해서 다음 분기로 넘어가기 전에 해당 분기를 완벽하게 탐색하는 방식
* 모든 노드를 방문하고자 할 때 이 방법 선택


BFS
* 너비 우선 탐색
* 루트 노드(혹은 다른 임의의 노드)에서 시작해서 인접한 노드를 먼저 탐색하는 방법으로, 
  시작 정점으로부터 가까운 정점을 먼저 방문하고 멀리 떨어져 있는 정점을 나중에 방문하는 순회 방법
* 최단 경로를 찾고 싶을 때 이 방법 선택
```

> - 그래프 구현 방법 : https://nobilitycat.tistory.com/entry/%EA%B9%8A%EC%9D%B4-%EC%9A%B0%EC%84%A0-%ED%83%90%EC%83%89-DFS-%EC%9D%B8%EC%A0%91-%ED%96%89%EB%A0%AC-%EC%9D%B8%EC%A0%91-%EB%A6%AC%EC%8A%A4%ED%8A%B8
> - DFS, BFS란 : https://devuna.tistory.com/32
> - 풀이 : https://infodon.tistory.com/96

<br/>

* 2178 - [미로탐색](https://www.acmicpc.net/problem/2178)
* 2606 - [바이러스](https://www.acmicpc.net/problem/2606)