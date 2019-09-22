package section6.oop.constructors_inheritance;

public class DeluxeBurger extends Hamburger {

    private String additionalItem5 = "chips";
    private double additionalItem5price = 1.15;
    private String additionalItem6 = "drinks";
    private double additionalItem6price = 2.15;

    public DeluxeBurger(String meat, String rollType, double burgerPrice) {
        super(meat, rollType, burgerPrice);
        super.burgerPrice += this.additionalItem5price;
        super.burgerPrice += this.additionalItem6price;

    }


    @Override
    public void myBurger() {
        super.myBurger();
    }

    @Override
    public void setAdditionalItem1(String additionalItem1, double additionalItem1price) {
    }

    @Override
    public void setAdditionalItem2(String additionalItem2, double additionalItem2price) {
    }

    @Override
    public void setAdditionalItem3(String additionalItem3, double additionalItem3price) {
    }

    @Override
    public void setAdditionalItem4(String additionalItem4, double additionalItem4price) {
    }
}
