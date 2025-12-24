package lr6.example7;

public class Task7 {
    public static int[] arrayIndex (char[] ch){
        int[] index = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            index[i] = (int) ch[i];
        }
        return index;
    }
}
