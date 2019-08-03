package section4.methods.overloading;

public class SpeedConverter {

    public static long toMilesPerHour(double kmph) {
        if(kmph < 0) {
            return -1;
        }

        long mph = Math.round(kmph / 1.609);

        return mph;
    }
}
