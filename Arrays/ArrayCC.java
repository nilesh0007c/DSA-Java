import java.util.*;

public class ArrayCC{
    public static void main(String[] args){

        int marks [] = new int [5];
        String subjects [] = new String[5];
        int sum = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        
        
        for (  i = 0 ; i < marks.length ; i++ ){
            System.out.println("Enter the subject name ");
            subjects[i] = sc.next();
            System.out.println("Enter the subject marks ");
            marks[i] = sc.nextInt();
        }

        double avg = 0.0;

        for ( i = 0 ; i < marks.length ; i++ ){         
            System.out.println("Marks of " + subjects[i] + " is " + marks[i]);
            //Avg
            sum = sum + marks[i];
            avg = sum / marks.length;
        }

           
        System.out.println("Average marks is " + avg);
    }
}
