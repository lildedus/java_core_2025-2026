package lr13.Examples;

public class Ex7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException ex) {
                System.out.println("Второе исключение перехвачено");
            }
        }
        System.out.println("3");
    }
}