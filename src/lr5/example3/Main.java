package lr5.example3;

public class Main {
    public static void main(String[] args) {
        Task3 ver1 = new Task3();
        Task3 ver2 = new Task3(10);
        Task3 ver3 = new Task3(10,15);
        System.out.println("Без передачи аргументов: "+ver1.getNum1()+" "+ver1.getNum2());
        System.out.println("С передачей одного аргумента: "+ver2.getNum1()+" "+ver2.getNum2());
        System.out.println("С передачей двух аргументов: "+ver3.getNum1()+" "+ver3.getNum2());
    }
}
