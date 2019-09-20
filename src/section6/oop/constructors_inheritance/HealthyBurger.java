package section6.oop.constructors_inheritance;

public class HealthyBurger extends Hamburger {

    private double spinach = 0.0;
    private double carrots = 0.0;
    private Item breadRoll;
    private int additionalItem = 0;

    public HealthyBurger() {
        super();
    }

    public HealthyBurger(double spinach, double carrots) {
        Item healthyBread = new Item("brown rye",1.0);
        setBreadRoll(healthyBread);
    }

    @Override
    public void addItem(String item) {
        if (additionalItem < 6)
            switch (item) {
                case "spinach": {
                    setSpinach(spinach);
                    additionalItem++;
                    addToTotalPrice(1.0);
                    break;
                }
                case "carrots": {
                    setCarrots(carrots);
                    additionalItem++;
                    addToTotalPrice(1.0);
                    break;
                }
                default:
                    super.addItem(item);
            }
    }

    public double getSpinach() {
        return spinach;
    }

    public void setSpinach(double spinach) {
        this.spinach = spinach;
    }

    public double getCarrots() {
        return carrots;
    }

    public void setCarrots(double carrots) {
        this.carrots = carrots;
    }

    @Override
    public Item getBreadRoll() {
        return breadRoll;
    }

    @Override
    public void setBreadRoll(Item breadRoll) {
        this.breadRoll = breadRoll;
    }
}
