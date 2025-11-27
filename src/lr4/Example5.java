package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размеры двумерного массива:");
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Изначальный массив:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        int[][] array1 = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                array1[i][j] = array[j][i];
            }
        }
        System.out.println("Транспонированный массив:" );
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
        in.close();
    }
}
