package lr5.example6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Task6 task6 = new Task6();
        System.out.println("Введите одно число для конструктора с 1 аргументом:");
        Task6 obj1 = new Task6(in.nextInt());
        obj1.output();

        System.out.print("\nВведите два числа для конструктора с 2 аргументами: ");
        Task6 obj2 = new Task6(in.nextInt(), in.nextInt());
        obj2.output();

        System.out.println("\n2. Работа с методами setValues:");
        Task6 obj3 = new Task6();

        System.out.print("Вызвать метод с одним аргументом. Введите число: ");
        obj3.setValues(in.nextInt());
        obj3.output();

        System.out.print("\nВызвать метод с двумя аргументами. Введите два числа: ");
        obj3.setValues(in.nextInt(), in.nextInt());
        obj3.output();

        in.close();
    }
}