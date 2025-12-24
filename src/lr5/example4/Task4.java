package lr5.example4;
public class Task4 {
    private char aChar;
    private int anInt;
    private double code;
    public Task4(){}
    public void setCode(double code) {
        this.code = code;
    }

    public char getaChar() {
        int index = (int)code;
        aChar = (char)index;
        return aChar;
    }

    public int getAnInt() {
        anInt = (int) ((code - (int) code)*100);
        return anInt;
    }
}
