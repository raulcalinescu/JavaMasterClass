package section4.methods.overloading;

public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if ((hourOfDay < 8 && hourOfDay >= 0 || hourOfDay < 24 && hourOfDay > 22) && barking){
            return true;
        } else {
            return false;
        }
    }
}
