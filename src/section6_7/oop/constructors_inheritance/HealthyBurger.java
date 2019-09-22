package section6_7.oop.constructors_inheritance;

public class HealthyBurger extends Hamburger {

    private String ryeRollType;
    private String healthyExtraName1;
    private double healthyExtraName1price;
    private String healthyExtraName2;
    private double HealthyExtraName2price;

    public HealthyBurger(String meat, double burgerPrice) {
        super("Healthy Burger", meat, "Brown Rye", burgerPrice);
    }

    @Override
    public void myBurger() {
        if(healthyExtraName1 != null) {
            super.burgerPrice += this.healthyExtraName1price;
        }
        if(healthyExtraName2 != null) {
            super.burgerPrice += this.HealthyExtraName2price;
        }
        super.myBurger();
    }

    public void setExtraName1(String additionalItem5, double additionalItem5price) {
        this.healthyExtraName1 = additionalItem5;
        this.healthyExtraName1price = additionalItem5price;
        System.out.println("Adding " + this.healthyExtraName1 + " at the price of " + this.healthyExtraName1price);
    }

    public void setExtraName2(String additionalItem6, double additionalItem6price) {
        this.healthyExtraName2 = additionalItem6;
        this.HealthyExtraName2price = additionalItem6price;
        System.out.println("Adding " + this.healthyExtraName2 + " at the price of " + this.HealthyExtraName2price);
    }

}
