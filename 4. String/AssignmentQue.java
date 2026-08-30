import java.util.Scanner;

public class AssignmentQue {
    
    public static int countOfLowercaseVowels(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr any String:");
        String str = sc.nextLine();
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                count++;
            }
        }
        return count;
    } 


    public static void main(String args[]){

        // System.out.println(countOfLowercaseVowels());

        // String str="ShradhaDidi";
        // String str1="ApnaCollege";
        // String str2="ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));

        String str="ApnaCollege".replace("e","");
        System.out.println(str);
    }
}
