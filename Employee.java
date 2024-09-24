public class Employee {
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;

    public Employee (String name,double baseSalary){
        this.name = name;
        this.baseSalary=baseSalary;
        this.healthAllowance = 0.0;
        this.transportAllowance = 0.0;
        this.bonus = 0.0;
        this.totalSalary= 0.0;
        
    }

    public String getName(){
        return name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public void setHealthAllowance(double healthAllowance) {
        this.healthAllowance = healthAllowance;
    }

    public void setTransportAllowance(double transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    public double calculateTotalSalary(){
        totalSalary = baseSalary + healthAllowance + transportAllowance + bonus ;
        return totalSalary;
    }

    public void assignBonus() {
        if (baseSalary > 50000) {
            bonus = baseSalary * 0.10; // 10% bonus
        } else if (baseSalary >= 30000 && baseSalary <= 50000) {
            bonus = baseSalary * 0.05; // 5% bonus
        } else {
            bonus = 0; // No bonus
        }
    }

    public static void assignBonusesToEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            employee.assignBonus();  
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + getName());
        System.out.println(getName()+"'s"+" "+"Base Salary: " + baseSalary);
        System.out.println(getName()+"'s"+" "+"Health Allowance: " + healthAllowance);
        System.out.println(getName()+"'s"+" "+"Transport Allowance: " + transportAllowance);
        System.out.println(getName()+"'s"+" "+"TotalSalary: " + calculateTotalSalary());
    }
}
