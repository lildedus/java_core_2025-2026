package lr13.Task1;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = null;
        int n = 0;
        try {
            System.out.print("n = ");
            n = in.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("a[" + i + "] = ");
                String s = in.next();
                if (!s.matches("-?\\d+")) {
                    throw new Exception("Введено не целое число: " + s);
                }
                a[i] = Integer.parseInt(s);
            }
            int s = 0, c = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > 0) {
                    s += a[i];
                    c++;
                }
            }
            if (c == 0) throw new Exception("Нет положительных");
            System.out.println("Среднее: " + (double) s / c);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            in.close();
        }
    }
}