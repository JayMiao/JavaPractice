/**
 * Created by miaoyuanjun on 16/1/16.
 */
public class Employee {
    public String name;

    private double salary;

    /**
     * Employee
     * @param empName
     */
    public Employee (String empName) {
        name = empName;
    }

    public void setSalary(double empSal) {
        salary = empSal;
    }

    public void printEmp() {
        System.out.println("name :" + name);
        System.out.println("salary :" + salary);
    }

    public static void main(String args[]) {
        Employee emp = new Employee("jay");
        emp.setSalary(100);
        emp.printEmp();
    }
}
