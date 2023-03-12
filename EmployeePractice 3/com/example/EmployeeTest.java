package com.example;
import com.example.business.EmployeeStockPlan;
import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeTest {

    static void PrintEmployee(Employee emp, EmployeeStockPlan esp) {
        System.out.println(emp);
        System.out.println("Stock Options: " + esp.grantStock(emp));
        System.out.println("Employee Type: " + emp.getClass().getSimpleName());
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

        Employee emp = new Employee(15, "Dinmukhammed Korganbek", "000-00-0000", 100000.0);
        EmployeeStockPlan esp = new EmployeeStockPlan();

        PrintEmployee(emp, esp);

    }
}