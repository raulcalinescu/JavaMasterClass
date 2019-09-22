package section6.oop.constructors_inheritance;

public class HealthyBurger extends Hamburger {

    private String ryeRollType;
    private String additionalItem5;
    private double additionalItem5price;
    private String additionalItem6;
    private double additionalItem6price;

    public HealthyBurger(String meat, double burgerPrice, String ryeRollType) {
        super(meat, "", burgerPrice);
        this.ryeRollType = ryeRollType;
        super.rollType = ryeRollType;
    }

    @Override
    public void myBurger() {
        if(additionalItem5 != null) {
            super.burgerPrice += this.additionalItem5price;
        }
        if(additionalItem6 != null) {
            super.burgerPrice += this.additionalItem6price;
        }
        super.myBurger();
    }

    public void setAdditionalItem5(String additionalItem5, double additionalItem5price) {
        this.additionalItem5 = additionalItem5;
        this.additionalItem5price = additionalItem5price;
        System.out.println("Adding " + this.additionalItem5 + " at the price of " + this.additionalItem5price);
    }

    public void setAdditionalItem6(String additionalItem6, double additionalItem6price) {
        this.additionalItem6 = additionalItem6;
        this.additionalItem6price = additionalItem6price;
        System.out.println("Adding " + this.additionalItem6 + " at the price of " + this.additionalItem6price);
    }

}
