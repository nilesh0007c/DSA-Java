import java.util.*;

class StringBasic{

    public static void basicIO(){
        String fName;
        String lName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Frist Name: ");
        fName = sc.nextLine(); //input
        System.out.println("Enter your Last Name: ");
        lName = sc.nextLine(); //input
        System.out.println("Welcome @"+fName+"!"); //output

        // String Function - length()
        System.out.println("Length of String is "+lName.length()); //length of last name

        // String Function - Concatination
        String fullName;
        fullName = fName +" "+lName+"."; //Concatination
        System.out.println(fullName);

        // String charAt() Method
        System.out.println(fullName.charAt(0));

    }

    public static boolean compareStrings(){
        String str1 = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");

        // Compare String1 and String2 Outpt:true
        // if(str1 == str2){
        //     return true;
        // }else{
        //     return false;
        // }

        // Compare String1 and String3 Output:false
        // if(str1 == str3){
        //     return true;
        // }else{
        //     return false;
        // }

        //Compare String1 and String3 Output:true
        if(str1.equals(str3)){
            return true;
        }else{
            return false;
        }
    }

    public static String subString(String str, int si, int ei){
        String subStr = "";
        for(int i=si; i<ei; i++){
            subStr +=str.charAt(i);
        }
        return subStr;
    }

    
    public static void main(String args[]){
        String str ="Hello World";

        // basicIO();                               //call function of basicIO()
        // System.out.println(compareStrings());      //call function compareStings()
        // System.out.println(subString(str,0,5)); //call function subString()
        // System.out.println(str.substring(0,5)); //call Inbuilt function of Substring

        // StringBuilder Class
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
