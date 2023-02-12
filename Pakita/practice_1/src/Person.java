public class Person {
    public String first_name;
    public String last_name;
    private int age;

    public Person(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }
    

    public void setAge(int age) {
        if (age > 0 && age < 90){
            this.age = age;
        }
        else {
            System.out.println("Sorry your age more than 90 or less 0");
        }
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "Hello my name is " + first_name + "i'm " + age + "years old!";
    }
}
