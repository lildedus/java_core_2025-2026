package lr4;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размеры массива:");
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] array = new int[a][b];
        int num = 1;
        for (int i = 0; i < a; i++) {
            if (i%2==0){
                for (int j = 0; j < b; j++) {
                    array[i][j]=num;
                    num++;
                }
            } else {
                for (int j = b-1; j >=0 ; j--) {
                    array[i][j]=num;
                    num++;
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        in.close();
    }
}
