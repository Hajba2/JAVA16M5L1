package human;

public class DeveloperTest {

    public static void main(String[] args) {
        Developer developer = new Developer("Junior", "Ivan", 34);
        developer.setName("Ivan");

        System.out.println(developer);


        Developer dev = new Developer("middle");
        dev.setName("Gosha");
        System.out.println(dev);

        final int age = 19;
    }
}
