package lesson1_11.Task4;

public class Array4x2 {
    public char[][] arr =  {{'y','4'},
                            {'J','='},
                            {'L','b'},
                            {'>',']'}};
    public int printArray() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        return 1;
    }
}
