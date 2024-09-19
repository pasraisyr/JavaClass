public class Person {

    private String name;
    private int age;
    private int yos;
    private double gpa1;
    private double gpa2;
    private double gpa3;
    


    public Person(String name, int age,int yos, double gpa1,double gpa2,double gpa3){
        this.name = name;
        this.age = age;
        this.yos = yos;
        this.gpa1 = gpa1;
        this.gpa2 = gpa2;
        this.gpa3 = gpa3;

    }
    
    public void displayDetails(){
        int maxInt = Integer.MAX_VALUE;
        long maxPlusOne = 2147483648L;
        boolean condition = false;
        System.out.println(maxPlusOne);
        System.out.println(maxInt);
        System.out.println("The Name is :" + " " + name);
        System.out.println("The Age is :" +" "+ age);
        System.out.println("The Gpa is :" +" "+ gpa1);
        System.out.println("The Gpa is :" +" "+ gpa2);
        System.out.println("The Gpa is :" +" "+ gpa3);
        System.out.println("The Average of Gpa :" + ((gpa1+gpa2+gpa3)/3));
        System.out.println("The Years of study is :" +" "+ yos);
        


    }

    public static void main(String[] args) {
        Person person = new Person("naim" , 27,3,3,4,3);
        person.displayDetails();
    }
}