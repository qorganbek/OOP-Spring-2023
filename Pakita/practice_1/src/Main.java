public class Main {
    public static void main(String[] args){
        Person John = new Person("John", "Doe");
        System.out.println(John.first_name);
        John.setAge(19);
        System.out.println(John.getAge());
        System.out.println(John);
    }
}