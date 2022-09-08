public class Main {
    public static void main(String[] args) {
        System.out.println(SecondsAndMinutes.getDurationString(121L, 0L));
        System.out.println(SecondsAndMinutes.getDurationString(60L, 59L));
        System.out.println(SecondsAndMinutes.getDurationString(120L));
        System.out.println(SecondsAndMinutes.getDurationString(216001L));
        System.out.println(SecondsAndMinutes.getDurationString(-1L));
        System.out.println(SecondsAndMinutes.getDurationString(35L, -1L));
        System.out.println(SecondsAndMinutes.getDurationString(-1L, -1L));
        System.out.println(SecondsAndMinutes.getDurationString(3945L));
    }
}