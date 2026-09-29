public class Garage {

    public static void main(String[] args){
        Car soboCar = new Car();
        Car leoCar = new Car(2026, 1, "Koenigsegg", "Jesko");
        Car charlieCar = new Car(2026, 1, "Koenigsegg", "Jesko", true);

        System.out.println(soboCar.manufacturerName);

        System.out.println(charlieCar);

        charlieCar.engageTurbo();
    }
}