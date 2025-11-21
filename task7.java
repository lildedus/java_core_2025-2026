package lr3;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int size = in.nextInt();
        char[] abc = new char[size];
        if (size<=0){
            System.out.println("Ошибка ввода!");
        } else {
            for (int i = 0; i < size; i++) {
                abc[i] = (char) ('a'+i*2);
            }
            System.out.println("В прямом порядке:");
            for (int i = 0; i < size; i++) {
                System.out.print(abc[i]+" ");
            }
            System.out.println("\nВ обратном порядке:");
            for (int i = size-1; i >=0 ; i--) {
                System.out.print(abc[i]+" ");
            }
        }
        in.close();
    }
}
/*
7. Напишите программу, в которой создается одномерный
символьный массив из 10 элементов. Массив заполняется
буквами «через одну», начиная с буквы 'а': то есть
массив заполняется буквами 'а', 'с', 'е', 'д' и так далее.
Отобразите массив в консольном окне в прямом и обратном порядке.
Размер массива задается переменной.
*/