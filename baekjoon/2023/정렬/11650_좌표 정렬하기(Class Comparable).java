import java.util.*;

class Point implements Comparable<Point> {
    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getPoint() {
        return this.x + " " + this.y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        return this.x - o.x;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        ArrayList<Point> points = new ArrayList<>();
        for (int i=0; i<N; i++) {
            int x = in.nextInt(); // x
            int y = in.nextInt(); // y
            points.add(new Point(x, y));
        }

        Collections.sort(points);

        for (Point p : points) {
            System.out.println(p.getPoint());
        }
    }
}