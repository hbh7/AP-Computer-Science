package Person;

public class PersonTest {

    public static void main(String[] args) {
        Person bill = new Person("Bill", 160, "Blue", 60);
        Person sam = new Person("Sam", 150, "Green", 66);
        Person jaime = new Person("Jaime", 130, "Red", 5);
        Person emelia = new Person("Emelia", 120, "Green", 63);

        bill.print();
        System.out.println("-----");
        sam.print();
        System.out.println("-----");
        jaime.print();
        System.out.println("-----");
        emelia.print();
        System.out.println("-----");

        bill.eat("Pizza");
        emelia.eat("Chinese");
    }
}
