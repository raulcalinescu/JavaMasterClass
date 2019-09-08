package section6.oop.part1;

public class Point {

    private int x;
    private int y;

    public Point() {
        System.out.print("Empty Constructor called");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {  // Calculate distance from this point to origin or point zero
        Point zero = new Point(0,0);
        return Math.sqrt(Math.pow((zero.x - this.x),2) + Math.pow((zero.y - this.y),2));
    }

    public double distance(int x, int y) { //distance from this point to x,y point
        return Math.sqrt(Math.pow((x - this.x),2) + Math.pow((y - this.y),2));
    }

    public double distance(Point another) {   // distance from this point to another point
        return Math.sqrt(Math.pow((another.getX() - this.x),2) + Math.pow((another.getY() - this.y),2));
    }
}
