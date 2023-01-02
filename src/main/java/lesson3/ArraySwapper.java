package lesson3;

import java.util.Arrays;

public class ArraySwapper {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[5];
        String[] strArr = new String[10];

        for (int i = 0; i < 5; i++) {
            intArr[i] = i + 1;
            strArr[2 * i] = "String " + (2 * i + 1);
            strArr[2 * i + 1] = "String " + (2 * i + 2);
        }

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(strArr));


        swap(intArr, 0, 4);
        swap(strArr, 1, 9);


        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(strArr));

    }

    public static <T> void swap(T[] arr, int x, int y) {
        T elem;
        elem = arr[x];
        arr[x] = arr[y];
        arr[y] = elem;
    }
}

