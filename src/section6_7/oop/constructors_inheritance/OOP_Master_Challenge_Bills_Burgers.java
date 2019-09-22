package section6_7.oop.constructors_inheritance;


/*
Help Bills Burgers to manager their process of selling burgers.

Basic Hamburger:
- bread roll type
- meat   (base price)
- 4 additional additions (lettuce, tomato, carrot, etc) customer can select to add (separately priced)


Two extra varieties of burgers:

Healthy Burger
- brown rye bread roll
- 2 additional items, 6 in total.

Deluxe burger
- comes with chips and drinks as additions, and no extra additions are allowed.

All 3 types should have a method to display at all times the base price plus all additions.
Subclasses -> add totals to the final price.
 */


//IMPROVE THIS AFTER FINISHING JAVA MASTER COURSE

public class OOP_Master_Challenge_Bills_Burgers {

    public static void main(String[] args) {
      Hamburger classic = new Hamburger("classic", "patty", "white", 3.75);
      classic.myBurger();
      classic.setAdditionalItem1("tomato",1.75);
      classic.myBurger();

      HealthyBurger health = new HealthyBurger("vegan", 3.75);
      health.myBurger();
      health.setAdditionalItem1("tomato", 1);
      health.setAdditionalItem2("lettuce", 1);
      health.setAdditionalItem3("onion", 0.75);
      health.setAdditionalItem4("pickles", 1);
      health.setExtraName1("avocado", 2.15);
      health.myBurger();

      DeluxeBurger bigBurger = new DeluxeBurger();
      bigBurger.myBurger();

    }
}
