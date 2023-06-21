package lesson1_11.Task6;
public class Lighter {
    public int[] lamps =   {1, 0, 0, 1, 0, 0, 0, 1,
                            0, 0, 0, 1, 1, 0, 0, 0,
                            1, 1, 0, 0, 1, 1, 0, 0,
                            0, 0, 1, 1, 1, 1, 0, 0};
    public int blink(int k) {
        System.out.println("-Мигание-");
        for (int n = 0; n < k; n++) {
            System.out.print(n + " - ");
            if (n == 0) {
                for (int i = 0; i < lamps.length; i++) {
                    System.out.print(lamps[i]);
                }
            } else {
                for (int i = 0; i < lamps.length; i++) {
                    lamps[i] = lamps[i] == 1 ? 0 : 1;
                    System.out.print(lamps[i]);
                }
            }
            System.out.println("");
        }
        return 1;
    }
    public int run() {
        System.out.println("-Бегущая строка-");
        for (int i = 0; i < lamps.length; i++) {
            System.out.print(lamps[i]);
        }
        System.out.println("");
        int lastLamp = lamps[lamps.length - 1];
        System.arraycopy(lamps, 0, lamps, 1, 31);
        lamps[0] = lastLamp;
        for (int i = 0; i < lamps.length; i++) {
            System.out.print(lamps[i]);
        }
        System.out.println("");
        return 1;
    }
    public int mask1st() {
        System.out.println("-Проверка первой позиции-");
        System.out.println(lamps[0] == 1 ? "Лампочка в первой позиции включена" : "Лампочка в первой позиции выключена");
        return 1;
    }
    public int state() {
        System.out.println("-Текущее состояние-");
        for (int i = 0; i < lamps.length; i++) {
            System.out.print(lamps[i]);
            }
        System.out.println("");
        return 1;
    }
}
