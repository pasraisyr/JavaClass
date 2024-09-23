public class StudentScanner {
    
    private String name;
    private int[] scores = new int[3]; 
    private double avrgScore;

    public StudentScanner(String name, int math, int science, int english) {
        this.name = name;
        this.scores[0] = math;   
        this.scores[1] = science; 
        this.scores[2] = english;
    }

   
    public String getName() {
        return name;
    }

   
    public int[] getScores() {
        return scores;
    }

    
    public double calcAvr() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        this.avrgScore = total / 3.0; 
        return this.avrgScore;
    }

    
    public char assignGrade() {
        if (this.avrgScore >= 90 && this.avrgScore <= 100) {
            return 'A';
        } else if (this.avrgScore >= 80) {
            return 'B';
        } else if (this.avrgScore >= 70) {
            return 'C';
        } else if (this.avrgScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    
    public void displayStudentInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Math Score: " + scores[0]);
        System.out.println("Science Score: " + scores[1]);
        System.out.println("English Score: " + scores[2]);
        System.out.println("Average Score: " + calcAvr());
        System.out.println("Grade: " + assignGrade());
    }
}
