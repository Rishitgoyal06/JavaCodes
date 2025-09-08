public class AgeGroup {
    public static void main(String[] args) {
        int age = 20;
        
        if (age<12){
            System.out.println("Child");
        }
        else if (age>12 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Adult");
        }
    }
}
