public class Garage {

    public static void main(String[] args){
        Car soboCar = new Car();
        Car joeyCar = new Car(2020, 5, "Ford", "Mustang");
        Car daveCar = new Car(2009, 500, "Subaru", "Impreza WRX", true);

        System.out.println(soboCar.milesDriven);
        System.out.println(soboCar.manufacturerName);
        System.out.println(soboCar.hasTurbo);
        // soboCar.
        System.out.println(joeyCar.milesDriven);
        System.out.println(joeyCar.manufacturerName);
        System.out.println(joeyCar.hasTurbo);

        System.out.println(daveCar.milesDriven);
        System.out.println(daveCar.manufacturerName);
        System.out.println(daveCar.modelName);
        System.out.println(daveCar.hasTurbo);

        soboCar.engageTurbo();
        daveCar.revEngine();
        daveCar.engageTurbo();

        joeyCar.describeCar();
        daveCar.describeCar();
    }
}