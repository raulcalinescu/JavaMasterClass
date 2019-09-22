package section6.oop.constructors_inheritance;

public class Hamburger {

    private String meat;
    private String rollType;
    private double burgerPrice;

    private String additionalItem1;
    private double additionalItem1price;

    private String additionalItem2;
    private double additionalItem2price;

    private String additionalItem3;
    private double additionalItem3price;

    private String additionalItem4;
    private double additionalItem4price;

    public Hamburger(String meat, String rollType, double burgerPrice) {
        this.meat = meat;
        this.rollType = rollType;
        this.burgerPrice = burgerPrice;
    }

    public void myBurger() {
        if(additionalItem1 != null) {
            this.burgerPrice += this.additionalItem1price;
        }
        if(additionalItem2 != null) {
            this.burgerPrice += this.additionalItem2price;
        }
        if(additionalItem3 != null) {
            this.burgerPrice += this.additionalItem3price;
        }
        if(additionalItem4 != null) {
            this.burgerPrice += this.additionalItem4price;
        }
        System.out.println("My burger has " + this.meat + " meat on a " + this.rollType + " bread, at the price of " + this.burgerPrice +" \n");
    }

    public void setAdditionalItem1(String additionalItem1, double additionalItem1price) {
        this.additionalItem1 = additionalItem1;
        this.additionalItem1price = additionalItem1price;
        System.out.println("Adding " + this.additionalItem1 + " at the price of " + this.additionalItem1price);
    }

    public void setAdditionalItem2(String additionalItem2, double additionalItem2price) {
        this.additionalItem2 = additionalItem2;
        this.additionalItem2price = additionalItem2price;
        System.out.println("Adding " + this.additionalItem2 + " at the price of " + this.additionalItem2price);
    }

    public void setAdditionalItem3(String additionalItem3, double additionalItem3price) {
        this.additionalItem3 = additionalItem3;
        this.additionalItem3price = additionalItem3price;
        System.out.println("Adding " + this.additionalItem3 + " at the price of " + this.additionalItem3price);
    }

    public void setAdditionalItem4(String additionalItem4, double additionalItem4price) {
        this.additionalItem4 = additionalItem4;
        this.additionalItem4price = additionalItem4price;
        System.out.println("Adding " + this.additionalItem4 + " at the price of " + this.additionalItem4price);
    }

}