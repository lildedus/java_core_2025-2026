package lr13.Examples;

public class Ex14 {
    public static void m(int x) throws ArithmeticException {
        if (x == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        int h = 10 / x;
        System.out.println("Результат: " + h);
    }
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива = " + l);
            m(l + 1);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}