package lr7.example5;

public class Main {
    public static void main(String[] args) {
        SuperClassTask5 objSuper = new SuperClassTask5("Hello");
        SubClassTask5_1 objSub_1 = new SubClassTask5_1("Hello",11);
        SubClassTask5_2 objSub_2 = new SubClassTask5_2("Hello",'!');
        System.out.println("Прямой вызов toString():");
        System.out.println(objSuper.toString());
        System.out.println(objSub_1.toString());
        System.out.println(objSub_2.toString());
        System.out.println("Вызов через переменную суперкласса:");
        SuperClassTask5 sub1 = objSub_1;
        SuperClassTask5 sub2 = objSub_2;
        System.out.println(sub1.toString());
        System.out.println(sub2.toString());
    }
}
