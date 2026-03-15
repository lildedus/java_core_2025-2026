package lr9.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] ints = new int[size];
        System.out.println("Введите элементы массива:");
        input(ints, 0, in);
        System.out.print("Введенный массив: ");
        output(ints, 0);
        in.close();
    }
    public static void input(int[] arr, int index, Scanner in){
        if (index < arr.length){
            arr[index]= in.nextInt();
            input(arr, index + 1, in);
        }
    }
    public static void output(int[] arr, int index){
        if (index < arr.length){
            System.out.print(arr[index]);
            if (index < arr.length - 1){
                System.out.print(", ");
            }
            output(arr, index + 1);
        }
    }
}
