public class OperatorsExample { 
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // Relational Operators
        System.out.println("Equal to: " + (a == b)); // false
        System.out.println("Not equal to: " + (a != b)); // true
        System.out.println("Greater than: " + (a > b)); // true
        System.out.println("Less than: " + (a < b)); // false
        System.out.println("Greater than or equal to: " + (a >= b)); // true
        System.out.println("Less than or equal to: " + (a <= b)); // false

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false

        // Assignment Operators
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("c after += 5: " + c); // 25
        c -= 3; // c = c - 3
        System.out.println("c after -= 3: " + c); // 22
        c *= 2; // c = c * 2
        System.out.println("c after *= 2: " + c); // 44
        c /= 4; // c = c / 4
        System.out.println("c after /= 4: " + c); // 11
        c %= 3; // c = c % 3
        System.out.println("c after %= 3: " + c); // 2

        //To find out the avg of 5 numbers
        int num1 = 10, num2 = 20, num3 = 30, num4 = 40, num5 = 50;
        int sum = num1 + num2 + num3 + num4 + num5;
        double average = sum / 5.0;
        System.out.println("Average of 5 numbers: " + average); // 30.0
        
    }
}