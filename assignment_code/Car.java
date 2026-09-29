public class Car
{
    int year;
    int milesDriven;
    String manufacturerName;
    String modelName;
    boolean hasTurbo;

    //Base model constructor
    public Car() {
        year = 2026;
        milesDriven = 4_000;
        manufacturerName = "Honda";
        modelName = "CRV";
        hasTurbo = false;
    }

    //Custom car
    public Car(int year, int milesDriven, String manufacturerName, String modelName) {
        this.year = year;
        this.milesDriven = milesDriven;
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        hasTurbo = false;
    }

    public Car(int year, int milesDriven, String manufacturerName, String modelName, boolean hasTurbo) {
        this.year = year;
        this.milesDriven = milesDriven;
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        this.hasTurbo = hasTurbo;
    }

    public static void main(String[] args)
    {
    }

    public void describeCar(){
        System.out.println("This is a " + year + " " + manufacturerName + " " + modelName + " with " + milesDriven + " miles on it.");
    }

    public void revEngine()
    {
        System.out.println("The " + manufacturerName + " " + modelName + " goes \'VROOM, VROOM\'.");
    }

    public void engageTurbo()
    {
        if(hasTurbo)
        {
            System.out.println("TURBO ENGAGED!!!");
        }
        else
        {
            System.out.println("Nice try, but there's no turbo in this car.");
        }
    }

    public String toString() {
        return year + " " + manufacturerName + " " + modelName + " with " + milesDriven + " miles.";
    }
}