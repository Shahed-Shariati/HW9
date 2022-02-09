package Tamrin1;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
   private static HashMap<String,String> result = new HashMap<>();
   private static String temp;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first string");
        String firstString = input.nextLine().trim();
        System.out.println("Enter your second String");
        String secondString = input.nextLine().trim();
        int length = firstString.length();
        permute(firstString,0,length-1);
        if(result.get(secondString) == null){
            System.out.println("Fail");
        }else {
            System.out.println("Pass");
        }
    }

    private static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.print("");
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    private static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        result.put(String.valueOf(charArray),"d");
        return String.valueOf(charArray);
    }
}
