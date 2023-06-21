package lesson1_11.Task3;
import java.util.Arrays;
public class Array3x6 {
    public String[][] mass =   {{"a1","a2","a3","a4","a5","a6"},
                                {"b1","b2","b3","b4","b5","b6"},
                                {"c1","c2","c3","c4","c5","c6"}};
    public int printArray() {
        for (int i =0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println("");
        }
        return 1;
    }
}
