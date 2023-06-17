### 정렬

#### 10814 - [나이순 정렬](https://www.acmicpc.net/problem/10814)

구현하는 방법은 두가지가 있다.
1. `배열`에 나이와 이름을 저장한 뒤, `Arrays.sort()에 Comparator의 compare 메소드`를 구현하여 정렬

```java
String[][] array = new String[N][2];
for (int i=0; i<N; i++) {
    array[i][0] = in.next();
    array[i][1] = in.next();
}

// 나이순으로 정렬(오름차순)
Arrays.sort(array, new Comparator<String[]>() {
    @Override
    public int compare(String[] o1, String[] o2) {
        return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
    }
});
```

2. `클래스 객체`를 만들어 나이와 이름을 저장한 뒤, `Comparable 클래스`를 사용하여 정렬

```java
class Member implements Comparable<Member> {
    private int age;
    private String name;

    @Override
    public int compareTo(Member o) {
        // 나이순으로 정렬(오름차순)
        return this.age - o.age;
    }
}
```

<br>

#### 11650 - [좌표 정렬하기](https://www.acmicpc.net/problem/11650)

- `클래스 객체`를 만들어 저장한 후 `Collections.sort() 에 Comparator의 compare 메소드` 를 구현하여 정렬할 수도 있다. 

```java
class Point implements Comparable<Point> {
    private int x, y;
}

ArrayList<Point> points = new ArrayList<>();
for (int i=0; i<N; i++) {
    int x = in.nextInt();
    int y = in.nextInt();
    points.add(new Point(x, y));
}

Collections.sort(points, new Comparator<Point>() {
    @Override
    public int compare(Point o1, Point o2) {
        if (o1.getX() == o2.getX()) return o1.getY() - o2.getY();
        return o1.getX() - o2.getX();
    }
});
```