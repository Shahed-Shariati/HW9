package Tamrin1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your string:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = str.length();
        Main permutation = new Main();
        permutation.permute(str, 0, n-1);
    }




    private  void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
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
