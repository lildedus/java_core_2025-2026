package lr4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину стороны треугольника");
        int a = in.nextInt();
        char[][] triangle = new char[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-i; j++) {
                triangle[i][j] = '#';
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <a; j++) {
                if (triangle[i][j] =='#'){
                    System.out.print(triangle[i][j]);
                }
            }
            System.out.println();
        }
    in.close();
    }
}
