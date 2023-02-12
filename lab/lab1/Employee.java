import javax.security.sasl.Sasl;

public class Employee {
    int empID;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + empID +
                ", Name='" + name + '\'' +
                ", Social Security Number='" + ssn + '\'' +
                ", Salary=" + salary +
                '}';
    }

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    String ssn;
    double salary;

    public Employee(int ID, String Name, String Social_Security_Number, double Salary){
        this.empID = ID;
        this.name = Name;
        this.ssn = Social_Security_Number;
        this.salary = Salary;
    }
}
