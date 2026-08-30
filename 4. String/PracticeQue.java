import java.util.*;

public class PracticeQue {

    // check isPalindrome
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    // Find Displacement
    public static float getShortestPath(String path){
        int x=0, y=0;
        char dir;
        for(int i=0; i<path.length(); i++){
            dir = path.charAt(i);
            if(dir == 'S'){
                y--;    //South
            }else if(dir == 'N'){
                y++;    //North
            }else if(dir == 'W'){
                x--;    //West
            }else{
                x++;    //East
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    // Print largest String (Lexixografic method)
    public static String findLargest(String[] fruits){
        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
            // Capital and Small letters are different in given function - compareTo()
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }

            // Capital and Small letters are same in given function - compareToIgnoreCase()
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        return largest;
    }

    // Print only first letter of word to Uppercase
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1 ){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // String Comparession
    public static String comparess(String str){
        // using String
        // String newStr = "";
        // for(int i=0; i<str.length(); i++){
        //     Integer count=1;
        //     while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     newStr += str.charAt(i);
        //     if(count > 1){
        //         newStr += count.toString();
        //     }
        // }

        // Using String Builder
        StringBuilder newStr = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count > 1){
                newStr.append(count.toString());
            }
        }

        return newStr.toString();
    }

    public static void main(String args[]){
        // 1. isPalindrome
        // String str="racecar";
        // System.out.println(isPalindrome(str));

        // 2.Find Displacement
        // String path ="WNENENESENNN";
        // System.out.println(getShortestPath(path));

        // 3. Find Largest
        // String fruits[] = {"Apple", "Mango", "banan"};
        // System.out.println(findLargest(fruits));

        // 4. First letter of each word to UpperCase
        // String str = "hi, i am nilesh";
        // System.out.println(toUpperCase(str));

        // 5. String Compression
        String str = "aaabbcd"; 
        System.out.println(comparess(str));
    }
}
