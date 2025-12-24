package lr6.example8;

public class Task8 {
    public static double average(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return (double) sum/array.length;
    }
}
