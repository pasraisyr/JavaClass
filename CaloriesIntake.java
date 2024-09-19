public class CaloriesIntake {
    public static void main(String[] args) {
        
        int[] calories = new int[7]; 
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        int totalCalories = 0;
        int startingCalories = 1200; 

        for (int i = 0; i < 7; i++) {
            calories[i] = startingCalories + (i*100);
            System.out.println(days[i] + ": " + calories[i] + " calories");
            totalCalories += calories[i]; 
        }

       
        System.out.println("\nTotal calories intake for the week: " + totalCalories);
    }
}
