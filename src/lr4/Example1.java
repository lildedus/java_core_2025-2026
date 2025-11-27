package lr4;

public class Example1 {
    public static void main(String[] args) {
        int height = 11;
        int i, j, z;
        for (i = 1; i <=height ; i++) {
            System.out.print("номер строки: "+i+" ");
            z=0;
            for (j = -12; j <height; j++) {
                System.out.print("+");
                z+=1;
            }
            System.out.println(" Кол-во символов в строке: "+z);
        }
    }
}
