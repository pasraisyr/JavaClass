import java.util.Scanner;

public class StudentDataScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        StudentScanner[] students = new StudentScanner[2];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter Student's Name " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.println("Enter " + name +"'s" +" " +"Mathematics score"+ ": ");
            int math = scanner.nextInt();

            System.out.println("Enter " + name +"'s" +" " +"Science score"+ ": ");
            int science = scanner.nextInt();

            System.out.println("Enter " + name +"'s" +" " +"English score"+ ": ");
            int english= scanner.nextInt();
            scanner.nextLine(); 

           
            students[i] = new StudentScanner(name, math, science, english);
        }

        
        for (StudentScanner student : students) {
        student.displayStudentInfo();
        System.out.println("");
       }

        scanner.close();
    }
}
