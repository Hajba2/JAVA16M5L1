package car;

public class MainTwo {

    public static void main(String[] args) {
        Car car = new Car();
        car.publicModel = "asd";
        car.protectedModel = "asd";
        car.pcgDefaultModel = "asd";

        //FourWdCar fourWdCar = new FourWdCar();
        Kia k = new Kia();
        k.driveOnCruiseControl();
    }
}
