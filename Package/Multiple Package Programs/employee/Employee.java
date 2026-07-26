package employee;

public class Employee {
    private String name;
    private int empId;
    private double basicPay;

    public Employee(String name, int empId, double basicPay) {
        this.name = name;
        this.empId = empId;
        this.basicPay = basicPay;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Pay: " + basicPay);
    }
}