package lesson1_11.Task5;

import java.util.Arrays;

public class Array5x8 {
    public int[][] arr =   {{1, 6, 5, 9, 0, 2, 9, 3},
                            {7, 2, 3, 0, -3, 2, 1, 6},
                            {0, -8, 1, 8, 10, 23, 1, 7},
                            {6, 8, 11, 43, 22, 12, 6, 3},
                            {1, 1, 1, 1, 1, 1, 1, 1}};
    public int printArray() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        return 1;
    }
    public int printMaxMinArray() {
        int[][] sarr = new int[5][2];
        for (int i = 0; i < 5; i++) {
            int min = arr[i][0];
            int max = arr[i][0];
            for (int j = 0; j < 8; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            sarr[i][0] = min;
            sarr[i][1] = max;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sarr[i][j] + " ");
            }
            System.out.println("");
        }
        return 1;
    }
}
