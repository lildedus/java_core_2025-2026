package lr3;

public class task8 {
    public static void main(String[] args) {
        char[] array = new char[10];
        int count = 0;
        char wrong = 'A';
        while (count<10){
            if (wrong!='A' && wrong!='E' && wrong!='I'){
                array[count]=wrong;
                count++;
            }
            wrong++;
        }
        System.out.println("Массив согласных букв:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
    }
}
/*
8. Напишите программу, в которой создается символьный массив
из 10 элементов. Массив заполнить большими (прописными) буквами
английского алфавита. Буквы берутся подряд, но только согласные
(то есть гласные буквы 'A', 'E' и 'I' при присваивании значений
элементам массива нужно пропустить). Отобразите содержимое
созданного массива в консольном окне.
*/