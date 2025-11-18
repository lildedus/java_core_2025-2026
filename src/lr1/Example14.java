package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int a = in.nextInt();
        int b = a - 1;
        int c = a + 1;
        double d = Math.pow((a + b + c), 2);
        System.out.printf("a-1=%d\na=%d\na+1=%d\n(a+b+c)^2=%.0f", b, a, c, d);
        in.close();
    }
}
