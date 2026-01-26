class PolymorphismMO {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        PolymorphismMO obj = new PolymorphismMO();
        System.out.println("Sum of two numbers: " + obj.add(5, 10));
        System.out.println("Sum of three numbers: " + obj.add(5, 10, 15));
    }
}