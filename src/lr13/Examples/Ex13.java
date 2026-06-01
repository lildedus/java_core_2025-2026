package lr13.Examples;

public class Ex13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива = " + l);
            int h = 10 / (l + 1);
            System.out.println("Результат деления: " + h);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }
}