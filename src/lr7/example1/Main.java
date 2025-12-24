package lr7.example1;

public class Main {
    public static void main(String[] args) {
        SuperClassTask1 superClassObject1 =
                new SuperClassTask1("передал в конструктор суперкласса");
        String className = superClassObject1.toString();
        System.out.println(className);
        SubClassTask1 subClassObject2 =
                new SubClassTask1("передал в конструктор подкласса");
        String subClassName = subClassObject2.toString();
        System.out.println(subClassName);
        SubClassTask1 subClassObject3 =
                new SubClassTask1("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject3.toString();
        System.out.println(subClassName2);
    }
}
