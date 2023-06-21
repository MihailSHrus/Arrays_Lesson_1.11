import lesson1_11.Task1.Week;
import lesson1_11.Task2.Array4x4;
import lesson1_11.Task3.Array3x6;
import lesson1_11.Task4.Array4x2;
import lesson1_11.Task5.Array5x8;
import lesson1_11.Task6.Lighter;

public class Main {
    public static void main(String[] args){
        // Task1: Вывести последний день недели (Воскресенье)
        System.out.println("-Задние 1-");
        Week task1 = new Week();
        System.out.println(task1.lastElement());
        // Task2: Вывести первый элемент массива 4x4 (6)
        System.out.println("-Задние 2-");
        Array4x4 task2 = new Array4x4();
        System.out.println(task2.firstElement());
        // Task3: Вывести массив 3x6
        System.out.println("-Задние 3-");
        Array3x6 task3 = new Array3x6();
        task3.printArray();
        // Task4: Вывести массив символов 4x2
        System.out.println("-Задние 4-");
        Array4x2 task4 = new Array4x2();
        task4.printArray();
        // Task5: Вывести массивы 5x8 и 5x2 из макс. и мин. значений
        System.out.println("-Задние 5-");
        Array5x8 task5 = new Array5x8();
        task5.printArray();
        System.out.println("");
        task5.printMaxMinArray();
        // Task6: Реализовать программу с гриляндой через массивы
        System.out.println("-Задние 6-");
        Lighter task6 = new Lighter();
        task6.blink(4);
        task6.run();
        task6.mask1st();
        task6.state();
    }
}
