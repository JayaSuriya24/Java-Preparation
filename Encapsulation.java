class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jaya suriya manickavasagam");
        person.setAge(24);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
class Person {
    private String name;
    private int age; 

     public void setName(String name) {
        this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }   
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }   
}