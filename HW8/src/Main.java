public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("blue", true);
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());

    }
}