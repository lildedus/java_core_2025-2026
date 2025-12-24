package lr6.example6;

import java.util.Arrays;

public class Task6 {
    public static int[] getNumbers(int[] integerArray, int number){
        if (number<integerArray.length) {
            return Arrays.copyOf(integerArray, number);
        } else {
            return Arrays.copyOf(integerArray,integerArray.length);
        }
    }
}
