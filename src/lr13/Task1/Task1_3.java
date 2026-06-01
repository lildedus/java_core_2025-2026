package lr13.Task1;

import java.util.Scanner;

public class Task1_3 {
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
                a[i] = in.nextInt();
            }
            int s = 0, c = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > 0) {
                    s += a[i];
                    c++;
                }
            }
            if (c == 0) {
                throw new Exception("Ошибка: положительные элементы отсутствуют");
            }
            System.out.println("Среднее: " + (double) s / c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            in.close();
        }
    }
}