import java.util.*;

class Point {
    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() { return this.x; }
    int getY() { return this.y; }
}

public class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        ArrayList<Point> points = new ArrayList<>();
        for (int i=0; i<N; i++) {
            int x = in.nextInt(); // x
            int y = in.nextInt(); // y
            points.add(new Point(x, y));
        }

        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.getX() == o2.getX()) return o1.getY() - o2.getY();
                return o1.getX() - o2.getX();
            }
        });

        for (Point p : points) {
            System.out.println(p.getX() + " " + p.getY());
        }
    }
}