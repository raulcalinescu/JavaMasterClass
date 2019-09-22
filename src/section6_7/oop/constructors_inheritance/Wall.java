package section6_7.oop.constructors_inheritance;

public class Wall {

    private double width;
    private double height;

    public Wall() {
        System.out.println("Empty constructor called ");
    }

    public Wall(double width, double height) {
        if (width < 0.0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }

        if (height < 0.0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0)
            this.height = 0.0;
        else
            this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0)
            this.width = 0.0;
        else
            this.width = width;
    }

    public double getArea() {    // method without parameters because we have the fields already populated from constr.
        return this.width * this.height;
    }
}
