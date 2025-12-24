package lr6.example4;

public class Task4 {
    public static int getNum(int n){
        if (n < 0){
            System.out.println("Число должно быть неотрицательным!");
            return 0;
        }
        if (n == 0 || n == 1){
            return 1;
        }
        int x = 1;
        if (n %2==0){
            for (int i = 2; i <= n ; i+=2) {
                x *= i;
            }
        } else {
            for (int i = 1; i <=n ; i+=2) {
                x *= i;
            }
        }
        return x;
    }
}
