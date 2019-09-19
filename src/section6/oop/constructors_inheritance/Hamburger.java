package section6.oop.constructors_inheritance;

public class Hamburger {
   private Item breadRoll;
   private double meat = 0.0;
   private double tomato = 0.0;
   private double lettuce = 0.0;
   private double pickles = 0.0;
   private double onions = 0.0;
   private double totalPrice = 0.0;
   private int additionalItem = 0;

   public Hamburger() {
       Item breadRoll = new Item("Standard", 1.0);
       setBreadRoll(breadRoll);
       setMeat(1.0);
       addToTotalPrice(getMeat() + getBreadRoll().getPrice());
   }

   public void addItem(String item) {
       if (additionalItem < 4) {
           switch (item) {
               case "tomato": {
                   setTomato(1.0);
                   additionalItem++;
               }
               case "lettuce": {
                   setLettuce(1.0);
                   additionalItem++;
               }
               case "pickles": {
                   setPickles(1.0);
                   additionalItem++;
               }
               case "onions": {
                   setOnions(1.0);
                   additionalItem++;
               }
           }
       } else {
           System.out.print("You have reached the maximum number of items allowed for this type of Burger");
       }
   }

   public double getPrice() {
       this.totalPrice = getMeat() + getBreadRoll().getPrice() + getLettuce() + getOnions() + getPickles() + getTomato();
       return this.totalPrice;
   }

   public void addToTotalPrice(double price) {
       this.totalPrice += price;
   }

   public Item getBreadRoll() {
        return breadRoll;
   }

   public void setBreadRoll(Item breadRoll) {
        this.breadRoll = breadRoll;
   }

   public double getMeat() {
        return meat;
   }

   public void setMeat(double meat) {
        this.meat = meat;
   }
    public double getTomato() {
        return tomato;
    }

    public void setTomato(double tomato) {
        this.tomato = tomato;
    }

    public double getLettuce() {
        return lettuce;
    }

    public void setLettuce(double lettuce) {
        this.lettuce = lettuce;
    }

    public double getPickles() {
        return pickles;
    }

    public void setPickles(double pickles) {
        this.pickles = pickles;
    }

    public double getOnions() {
        return onions;
    }

    public void setOnions(double onions) {
        this.onions = onions;
    }

}

class Item {
    private String name;
    private double price = 0.0;

    Item (String name, double price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}