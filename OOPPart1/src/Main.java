public class Main {
    public static void main(String[] args) {
        Car mini = new Car();
        mini.setMake("MINI");
        mini.setModel("Hardtop");
        mini.setColor("Black");
        mini.setDoors(2);
        mini.setConvertible(false);
//        System.out.println("make = " + mini.getMake());
//        System.out.println("model = " + mini.getModel());
        mini.describeCar();
        
        Car dodge = new Car();
        dodge.setMake("DODGE");
        dodge.setModel("Grand Caravan");
        dodge.setColor("Silver");
        dodge.setDoors(5);
        dodge.setConvertible(false);
        dodge.describeCar();
    }
}