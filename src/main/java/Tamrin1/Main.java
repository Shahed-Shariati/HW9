package Tamrin1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int strLength = str.length();
        Main permutation = new Main();
        permutation.permute(str, 0, strLength-1);
    }




    private  void permute(String strInput, int start, int strLength)
    {
        if (start == strLength)
            System.out.println(strInput);
        else
        {
            for (int i = start; i <= strLength; i++)
            {
                strInput = swap(strInput,start,i);
                permute(strInput, start+1, strLength);
                strInput = swap(strInput,start,i);
            }
        }
    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }



}
