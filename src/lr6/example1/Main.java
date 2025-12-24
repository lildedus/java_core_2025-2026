package lr6.example1;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.setValues('A');
        System.out.println("char: " + task1.getaChar() + ", string: " + task1.getStr());
        task1.setValues("Hello");
        System.out.println("char: " + task1.getaChar() + ", string: " + task1.getStr());
        task1.setValues(new char[]{'B'});
        System.out.println("char: " + task1.getaChar() + ", string: " + task1.getStr());
        task1.setValues(new char[]{'C', 'D', 'E'});
        System.out.println("char: " + task1.getaChar() + ", string: " + task1.getStr());
        task1.setValues((String) null);
        System.out.println("char: " + task1.getaChar() + ", string: " + task1.getStr());
        task1.setValues(new char[]{});
        System.out.println("char: " + task1.getaChar() + ", string: " + task1.getStr());
    }

}
