package lr6.example9;

public class Task9 {
    public static char[] array(char[] arrayInverted){
        for (int i = 0, j = arrayInverted.length-1; i < j; i++, j--) {
            char chars = arrayInverted[i];
            arrayInverted[i] = arrayInverted[j];
            arrayInverted[j] = chars;
        }
        return arrayInverted;
    }
}
