interface Employee {
    double getBasicSalary();
    double getHRA();
    double getTA();
    double getDA();
    double getGrossSalary();
    double getNetSalary();
}
class EmployeeSalaryDetails implements Employee {
    private double basicSalary;
    private double hra;
    private double ta;
    private double da;
       public EmployeeSalaryDetails(double basicSalary, double hra, double ta, double da) {
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.ta = ta;
        this.da = da;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public double getHRA() {
        return hra;
    }
    public double getTA() {
        return ta;
    }
    public double getDA() {
        return da;
    }
    public double getGrossSalary() {
        return basicSalary + hra + ta + da;
    }
    public double getNetSalary() {
        return getGrossSalary() - (0.1 * getGrossSalary()); 
    }
}
public class Salaryofemployee{
    public static void main(String[] args) {
        EmployeeSalaryDetails employee = new EmployeeSalaryDetails(50000, 10000, 5000, 15000);
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("HRA: " + employee.getHRA());
        System.out.println("TA: " + employee.getTA());
        System.out.println("DA: " + employee.getDA());
        System.out.println("Gross Salary: " + employee.getGrossSalary());
        System.out.println("Net Salary: " + employee.getNetSalary());
    }
}
