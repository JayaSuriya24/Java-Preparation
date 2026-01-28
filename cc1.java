import java.util.Scanner;
class cc1 {
    public static void main(String[] args) {
    System.out.print("Enter the mark:");
    Scanner sc = new Scanner(System.in);
    int mark = sc.nextInt();
  
        System.out.println("Mark is: " + mark);
        if (mark >= 35) {
            System.out.println("You are passed");
        } else {
            System.out.println("You are failed");
     }
}
}