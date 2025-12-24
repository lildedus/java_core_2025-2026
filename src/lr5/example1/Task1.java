package lr5.example1;

public class Task1 {
    private char aChar;

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }
    public int code(){
        return aChar;
    }
    public void aCharAndCode(){
        System.out.println("Символ: "+aChar);
        System.out.println("Код символа: "+(int) aChar);
    }
}
