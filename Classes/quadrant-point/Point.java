package Classes.quadrant-point;
public class Point {
    public int num1;
    public int num2;

    public Point(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int quadrant() {
        int quadrant = 0;

        int num1 = getNum1();
        int num2 = getNum2();

        if (num1 > 0 && num2 > 0) {
            quadrant = 1;
        } else if (num1 < 0 && num2 > 0) {
            quadrant = 2;
        } else if (num1 < 0 && num2 < 0) {
            quadrant = 3;
        } else if (num1 > 0 && num2 < 0) {
            quadrant = 4;
        } else if (num1 == 0 || num2 == 0) {
            quadrant = 0;
        }

        return quadrant;
    }
}
