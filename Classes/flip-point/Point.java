package Classes.flip-point;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.y = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.x = y;
    }

    public void flip() {
        System.out.println("After Swapping:");
        System.out.println("x coordinate:" + getY());
        System.out.println("y coordinate:" + getX());
    }
}
