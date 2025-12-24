package lr6.example10;

public class Task10 {
    public static int[] values(int... ints){
        int max = ints[0], min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i]<min) min = ints[i];
            if (ints[i]>max) max = ints[i];
        }
        return new int[]{min,max};
    }
}
