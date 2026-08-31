import java.util.*;

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

    public static boolean isAnagrams(String str1, String str2){

        // Convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){

            // convert string into char array
            char[] str1charArray = str1.toCharArray();
            char[]  str2charArray = str2.toCharArray();

            // sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray, str2charArray);

            if(result){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static void main(String args[]){

        // System.out.println(countOfLowercaseVowels());

        // String str="ShradhaDidi";
        // String str1="ApnaCollege";
        // String str2="ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));

        // String str="ApnaCollege".replace("e","");
        // System.out.println(str);


        // Find Strings are anagrams or not
        String str1 ="race0";
        String str2 ="care";
        System.out.println(str1+" and "+str2+" are anagrams of eachother is "+isAnagrams(str1,str2)+".");

    }
}
