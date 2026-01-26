class PolymorphismMR {
    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        PolymorphismMR obj1 = new PolymorphismMR();
        System.out.println("Sum from base class: " + obj1.add(5, 10));

        MethodOverriding obj2 = new MethodOverriding();
        System.out.println("Sum from derived class: " + obj2.add(5, 10));
    }
}
class MethodOverriding extends PolymorphismMR {
    @Override
    public int add(int a, int b) {
        return a + b + 10; // Adding an extra 10 for demonstration
    }

}