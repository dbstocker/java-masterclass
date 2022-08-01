package challenges;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        String printStatement;
        int remainder = kiloBytes % 1024;
        int megaBytes = (kiloBytes - remainder) / 1024;

        if (kiloBytes < 0) {
            printStatement = "Invalid Value";
        } else {
            printStatement = kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB";
        }

        System.out.println(printStatement);
    }
}
