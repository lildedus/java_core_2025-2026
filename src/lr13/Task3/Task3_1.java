package lr13.Task3;

import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte[] a = null;
        int n = 0;
        int s = 0;
        try {
            System.out.print("n = ");
            n = in.nextInt();
            a = new byte[n];
            for (int i = 0; i < n; i++) {
                System.out.print("a[" + i + "] = ");
                int v = in.nextInt();
                if (v < Byte.MIN_VALUE || v > Byte.MAX_VALUE) {
                    throw new Exception("Значение вне диапазона byte");
                }
                a[i] = (byte) v;
                s += a[i];
            }
            System.out.println("Сумма: " + s);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            in.close();
        }
    }
}