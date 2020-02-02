import java.util.ArrayList;
public class test1{
    public static void main(String args[]) {
        System.out.println("hello world");
        ArrayList<String> aS = new ArrayList<String>();
        aS.add("house");
        aS.add("cafeteria");
        aS.add("home");
        aS.add("school");
        System.out.println(aS);

        System.out.println("******* elements starting with h ****");
        for (String string : aS) {
            if(string.substring(0,1).equals("h")){
                System.out.println(string);
            }
        }

        System.out.println("******* find string with max length");
        int max = 0;
        String maxString = "";
        for (String string : aS) {
           for (int i = 0; i < string.length(); i++) {
               if(string.length() > max){
                    max = string.length();
                    maxString = string;
               }
           }
          
        }
        System.out.println("The longest string is " + maxString);

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("boy");
        System.out.println(arr);
    }
}