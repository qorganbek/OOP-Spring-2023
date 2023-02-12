public class Person {
    String first_name;
    String last_name;
    int age;
    boolean is_admin;

    public Person(String first_name, String last_name, int age, boolean is_admin){
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.is_admin = is_admin;
    }


    @Override
    public String toString() {
        return first_name + ' ' + last_name;
    }




    static int b_day(String name){
        return 19;
    }

    public static void main(String[] args) {
        Person Dima = new Person("Dinmukhammed", "Korganbek", 19, true);
        System.out.println(Dima);
        String[] cars  = {"Volvo", "BMW"};
        for(String i : cars) {
            System.out.println(i);
        }
        System.out.println(b_day(Dima.first_name));
    }

}
