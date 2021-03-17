class Animal {

    String species = "123!";
    int a = 2000;
    public void printSpecies() {
        System.out.println(species);
    }

    public void superMethod() {
        System.out.println("I am super!");
    }


    String groundFlyingWater;
    Animal(String groundFlyingWater) {
        this.groundFlyingWater = groundFlyingWater;
    }
}

public class Dog extends Animal {

    private String species = "Dog";


    // 1st Usage: super is used to refer to parent class instance variable.
    @Override
    public void printSpecies() {
        System.out.println("Printing species...");
        System.out.println("Current: " + species);
        System.out.println("Default: " + super.species);
        System.out.println("Default: " + a);
    }


    // 2nd Usage: super can be used to invoke parent class method.
    @Override
    public void superMethod() {
        System.out.println("I am NOT super anymore!");
    }

    public void callSuper() {
        super.superMethod();
        superMethod();

    }


    // 3rd Usage: super is used to invoke parent class constructor.
    private String name;
    Dog(String groundFlyingWater, String name) {
        super(groundFlyingWater);
        this.name = name;
    }

    public void printDog() {
        System.out.println("Type: " + groundFlyingWater);
        System.out.println("Name: " + name);

    }


    public static void main(String[] args) {
        Dog d = new Dog("ground","Rex");
        d.printDog();
    }
}