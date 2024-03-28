public class Student {
    public static void add(){
        int physics = 70;
        int maths = 90;
        int totalmarks = physics + maths;
        System.out.println("the result of 2 subjects are " +totalmarks);
    }
    public static void main (String [] abs){
    System.out.println("print inside main");
    // invoking user defined method
        add();
        double x = calculatePercentage();
        System.out.println("percentage" +x);
    }
    public static double calculatePercentage(){
        int english = 80;
        int hindi = 70;
        double totalmarks = english + hindi;
        double percentage = (totalmarks/200)*100;
        System.out.println("percentage method");
        return percentage;


    }




}
