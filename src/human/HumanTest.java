package human;

public class HumanTest {

    public static void main(String[] args) {
        //33
        Human h1 = new Human("Ivan", 23);
        h1.setName("Ivan");
        h1.setAge(23);
        System.out.println("Human.amountOfChromosome = " + Human.AMOUNT_OF_CHROMOSOME);



        //34
        Human h2 = new Human("Inna", 25);
        h2.setName("Inna");

        System.out.println("h2.getName() = " + h2.getName());

        System.out.println(h1);
        System.out.println(h2);
    }
}
