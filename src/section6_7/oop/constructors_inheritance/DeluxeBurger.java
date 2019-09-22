package section6_7.oop.constructors_inheritance;

public class DeluxeBurger extends Hamburger {

    private String additionalItem5 = "chips";
    private double additionalItem5price = 1.15;
    private String additionalItem6 = "drinks";
    private double additionalItem6price = 2.15;

    public DeluxeBurger() {
        super("Deluxe", "sausage", "white", 14.54);
        super.setAdditionalItem1("Chips",2.75);
        super.setAdditionalItem2("drinks", 4.75);

    }


    @Override
    public void myBurger() {
        super.myBurger();
    }

    @Override
    public void setAdditionalItem1(String additionalItem1, double additionalItem1price) {
        System.out.println("Cannot add additional items for a deluxe burger");
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
