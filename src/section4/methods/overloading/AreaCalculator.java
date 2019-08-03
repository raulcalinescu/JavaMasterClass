package section4.methods.overloading;

public class AreaCalculator {

    public static double area (double radius) {
        if (radius < 0) return -1.0;
        return Math.PI * radius * radius;
    }

    public static double area (double x, double y) {
        if (x < 0 || y < 0) return -1.0;
        return x * y;
    }


    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }


    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, inches);
    }
}
