public class Tests {
    public static void main(String [] args) {

        int x = 19;
        int y = 2;
        if (x == x) {
            System.out.println(true);
        } else if (y == y) {
            System.out.println(true);
        }
        System.out.println(Math.max(x, y));

        x = 8;
        y = 4;

        System.out.println(x + y * 1.5);
    }
}
