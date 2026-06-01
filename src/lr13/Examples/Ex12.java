package lr13.Examples;

public class Ex12 {
    public static void m(String s, double d) {
        if (s == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (d > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }
    public static void main(String[] args) {
        try {
            m(null, 0.000001);
        } catch (IllegalArgumentException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
    }
}