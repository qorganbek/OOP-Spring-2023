package com.example;
import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Engineer;
import com.example.domain.Manager;
import java.text.NumberFormat;

public class EmployeeTest {

    static void PrintIn(Employee e) {
        System.out.println("Hello my name is " + e.getName());
        System.out.println("Employee id  " + e.getEmpID());
        System.out.println("Social secret number is " + e.getSSN());
        System.out.println("My Salary :" + NumberFormat.getCurrencyInstance().format(e.getSalary()));
    }



    public static void main(String[] args) {
        Engineer e1 = new Engineer(101,
                "Jane Smith",
                "012-34-5678",
                120.56
        );
        Manager m1 = new Manager(
                207,
                "Barbara Johnson",
                "054-12-2367",
                190.56,
                "US Marketing"
        );
        Admin a1 = new Admin(
                304,
                "Bill Monroe",
                "108-23-6509",
                75.56
        );
        Director d1 = new Director(
                12,
                "Susan Wheeler",
                "099-45-2340",
                120.45,
                "Global Marketing",
                1000000.0
        );

        System.out.println(e1);
        System.out.println(m1);
        System.out.println(a1);
        System.out.println(d1);

        e1.setName("Elon Mask");
        e1.raiseSalary(1500.0);
        System.out.println(e1);
        e1.raiseSalary(-5);
        e1.setName("");
        System.out.println(e1);
        System.out.println(NumberFormat.getCurrencyInstance().format(e1.getSalary()));
        PrintIn(m1);

    }
}