public class rat {
    private String name;
    private int age;

    public rat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void squeak() {
        System.out.println(name + " says: Squeak!");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food + ".");
    }

    public void run(int meters) {
        System.out.println(name + " runs " + meters + " m.");
    }

    @Override
    public String toString() {
        return "Rat{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        rat r1 = new rat("Remy", 2);
        rat r2 = new rat("Pepper", 1);

        System.out.println(r1);
        r1.squeak();
        r1.eat("cheese");
        r2.run(10);

        if (args.length > 0) {
            rat r3 = new rat(args[0], 0);
            r3.squeak();
        }
    }
}
