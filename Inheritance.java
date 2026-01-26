class Inheritance {
      public void display() {
        System.out.println("This is mainclass");
    }

    public static void main(String[] args) {
        Inheritance obj1 = new Inheritance();
        obj1.display();
        Inheritance obj = new subclass();
        obj.display();
      
    }
}
class subclass extends Inheritance {
    public void display() {
        System.out.println("This is subclass");
    }
}