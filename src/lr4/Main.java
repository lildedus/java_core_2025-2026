package lr4;

public class Main {
    public static String getEncryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i]+shift;
            arrayCharNew[i]=(char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);
        return encryptString;
    }
    public static String getDecryptString(String encryptString,int shift){
        return getEncryptString(encryptString,-shift);
    }
}
