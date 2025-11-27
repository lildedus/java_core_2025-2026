package lr4;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину катета треугольника: ");
        int width = in.nextInt();
        int z;
        int count = 1;
        for (int i = 0; i < width; i++) {
            if (count%10>0) {
                System.out.print("Номер строки: " + count + "    ");
            } else {
                System.out.print("Номер строки: " + count + "   ");
            }
            z=0;
            count++;
            for (int j = 0; j <width-i; j++) {
                System.out.print("+");
                z+=1;
            }
            System.out.println("     "+"Кол-во символов в строке: "+z);
        }
    }
}
