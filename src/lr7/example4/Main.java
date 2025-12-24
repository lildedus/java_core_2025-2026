package lr7.example4;

public class Main {
    public static void main(String[] args) {
        // Создание объектов
        SuperClassTask4 obj1 = new SuperClassTask4('A');
        SubClass1Task4 obj2 = new SubClass1Task4('B', "Hello");
        SubClass2Task4 obj3 = new SubClass2Task4('C', "World", 100);

        // Создание копий
        SuperClassTask4 copy1 = new SuperClassTask4(obj1);
        SubClass1Task4 copy2 = new SubClass1Task4(obj2);
        SubClass2Task4 copy3 = new SubClass2Task4(obj3);

        // Вывод
        System.out.println("Объекты:");
        System.out.println("SuperClass: aChar = " + obj1.aChar);
        System.out.println("SubClass1: aChar = " + obj2.aChar + ", str = " + obj2.str);
        System.out.println("SubClass2: aChar = " + obj3.aChar + ", str = " + obj3.str + ", value = " + obj3.value);

        System.out.println("\nКопии:");
        System.out.println("Копия SuperClass: aChar = " + copy1.aChar);
        System.out.println("Копия SubClass1: aChar = " + copy2.aChar + ", str = " + copy2.str);
        System.out.println("Копия SubClass2: aChar = " + copy3.aChar + ", str = " + copy3.str + ", value = " + copy3.value);
    }
}

