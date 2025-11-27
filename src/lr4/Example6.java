package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example6 {
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
        int x = random.nextInt(a);
        int y = random.nextInt(b);
        int[][] deleted = new int[a-1][b-1];
        int newi = 0;
        for (int i = 0; i < a; i++) {
            if (i == x ){
                continue;
            }
            int newj = 0;
            for (int j = 0; j < b; j++) {
                if (j == y){
                    continue;
                }
                deleted[newi][newj] = array[i][j];
                newj++;
            }
            newi++;
        }
        System.out.println("С удаленным столбцом "+(y+1)+" и строкой "+(x+1)+" :");
        for (int i = 0; i < a-1; i++) {
            for (int j = 0; j < b-1; j++) {
                System.out.print(deleted[i][j]+"\t");
            }
            System.out.println();
        }
        in.close();
    }
}
