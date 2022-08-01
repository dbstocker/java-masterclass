package challenges;

public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        boolean rangeCheck = (hourOfDay < 0 || hourOfDay > 23);
        boolean asleep = (hourOfDay < 8 || hourOfDay > 22);
        boolean wakeUp = false;

        if (!rangeCheck && asleep && barking) {
            wakeUp = true;
        }

        return wakeUp;
    }
}
