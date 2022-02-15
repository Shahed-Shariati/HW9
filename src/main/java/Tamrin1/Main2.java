package Tamrin1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String input = scanner.nextLine();
        int length = input.length();
       permutation(input,length);
    }
    public static void permutation(String input,int length){
        int min = 0;
        int max = 0;
        int[] array = new int[length];
        int indexArray = 0;
        for  (int i = 1; i <= length; i++) {
            min = min * 10 + i;
            max = max * 10 + (length - i + 1);

        }
        for (int i = min; i < max; i++) {
            int temp = i;
            indexArray = 0;
            boolean flag = true;
            while (temp > 0){
                if(temp % 10 <= 0 || temp % 10 > length)
                    break;
                array[indexArray++] = temp % 10;
                temp /= 10;
            }
            if(temp != 0)
                continue;
            for (int j = 0; j < length; j++) {
                for (int k = j+1; k < length; k++) {
                    if(array[j] == array[k]) {
                        flag = false;
                        continue;
                    }
                }
            }
            if(flag) {
                int temp1 = i;
                while (temp1 > 0) {
                    System.out.print(input.charAt(temp1 % 10 - 1));
                    temp1 /= 10;
                }
                System.out.println();
            }
        }

    }
}
