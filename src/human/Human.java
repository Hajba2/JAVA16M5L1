package human;

public class Human {

    public static final int AMOUNT_OF_CHROMOSOME = 46;

    private String name;
    private int age;

    public Human() {
        System.out.println("in default constructor HUMAN");
    }

    public Human(String name, int age) {
        System.out.println("in name age constructor HUMAN");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        System.out.println("amountOfChromosome = " + AMOUNT_OF_CHROMOSOME);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
