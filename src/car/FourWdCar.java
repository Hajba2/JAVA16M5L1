package car;

public abstract class FourWdCar extends Car {

    public static void beButifule() {
        System.out.println("im am good");
    }

    public void drive() {
        System.out.println("driving FourWdCar");
    }

    public void stop() {
        System.out.println("stopping FourWdCar");
    }

    public abstract void driveOnCruiseControl();
}
