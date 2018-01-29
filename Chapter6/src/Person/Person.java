package Person;

public class Person {

    private String name;
    private int weight;
    private String eyeColor;
    private int heightInInches;

    public Person (String name, int weight, String eyeColor, int heightInInches) {
        this.name = name;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.heightInInches = heightInInches;
    }

    public void print() {
        System.out.println(name);
        System.out.println(weight);
        System.out.println(eyeColor);
        System.out.println(heightInInches);
    }

    public void eat(String food) {
        System.out.println(this.name + " is eating " + food + ".");
    }
}

