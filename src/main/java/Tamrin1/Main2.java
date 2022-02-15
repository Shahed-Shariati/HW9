package Tamrin1;

public class Main2 {
    public static void main(String[] args) {
       permutation(3);
    }
    public static void permutation(int length){
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
            while (temp > 0){
                if(temp % 10 < 0 || temp % 10 > length)
                    break;
                array[indexArray++] = temp % 10;
                temp /= 10;
            }
            if(temp != 0)
                continue;
            for (int j = 0; j < length; j++) {
                for (int k = j+1; k < length-1; k++) {
                    if(array[j] == array[k])
                        continue;
                }
            }
            System.out.println(i);
        }

    }
}
