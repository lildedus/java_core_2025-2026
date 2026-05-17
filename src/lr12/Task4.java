package lr12;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i;
            Thread thread = new Thread(() -> System.out.println("Номер потока: " + threadNumber));
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}