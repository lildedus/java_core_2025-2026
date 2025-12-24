package lr6.example2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Начальное значение: "+ Task2.getNum());
        System.out.println("Вызов метода с увеличением значения поля на 1");
        Task2.numPlus();
        Task2.numPlus();
        System.out.println("Итоговое значение поля: " + Task2.getNum());
    }
}
