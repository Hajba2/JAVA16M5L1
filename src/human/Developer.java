package human;

public class Developer extends Human {

    private String position;

    Developer() {

    }

    Developer(String position) {
        System.out.println("Dev constr");
        this.position = position;
        setName("no name");
    }

    Developer(String position, String name, int age) {
        super(name, age);
        System.out.println("Dev constr");
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int calcSalary() {
        return position.equalsIgnoreCase("middle") ? 1000 : 700;
    }

    public int calcSalary(int coef) {
        return position.equalsIgnoreCase("middle") ? 1000 * coef : 700 * coef;
    }

    @Override
    public void setName(String name) {
        if (name.equalsIgnoreCase("Gosha")) {
            position = "Architect";
        }
        super.setName(name);
    }


    @Override
    public String toString() {
        return "Developer{" +
                "position='" + position + '\'' + "\n" +
                super.toString() +
                "\n}";
    }
}
