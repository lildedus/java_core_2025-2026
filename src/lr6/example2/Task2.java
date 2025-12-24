package lr6.example2;

public class Task2 {
    private static int num = 0;

    public static void numPlus() {
        System.out.println("Текущее значение "+num);
        num++;
    }

    public static int getNum() {
        return num;
    }

}
