package timus.task_1787;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int size = in.nextInt();
        int x = 0;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
            x +=array[i];
            if (x>k){
                x-=k;
            } else {
                x=0;
            }
        }
        System.out.println(x);
        in.close();
    }
}
