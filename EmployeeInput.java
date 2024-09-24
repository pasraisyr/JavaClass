import java.util.Scanner;

public class EmployeeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee [] employees = new Employee [2];
        
        for (int i=0; i<employees.length;i++) {
            System.out.println("Enter Employee Name " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.println("Enter " + name +"'s" +" " +"Base Salary"+ ": ");
            double baseSalary = scanner.nextDouble();

            employees[i]= new Employee(name, baseSalary);

            System.out.println("Enter " + name +"'s" +" " +"Health Allowance"+ ": ");
            double healthAllowance = scanner.nextDouble();
            employees[i].setHealthAllowance(healthAllowance);

            System.out.println("Enter " + name +"'s" +" " +"Transport Allowance"+ ": ");
            double transportAllowance = scanner.nextDouble();
            employees[i].setTransportAllowance(transportAllowance);

            employees[i].assignBonus();

            scanner.nextLine(); 
            
        }
        for (Employee employee : employees) {
            employee.displayEmployeeInfo();
            System.out.println("");
           }
        scanner.close();
    }
}
