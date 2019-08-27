package section6.oop.part1;

public class Car {
    private int doors;
    private int wheels;
    private String engine;
    private String model;


    public void setModel (String model) {
        String validModel =  model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

}
