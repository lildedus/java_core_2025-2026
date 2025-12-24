package lr5.example2;

public class Task2 {
    private char ch1;
    private char ch2;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    public void setCh2(char ch2) {
        this.ch2 = ch2;
    }

    public String getCode() {
        int codeLength = (int) ch2-(int) ch1+1;
        char[] code = new char[codeLength];
        for (int i = 0; i < codeLength; i++) {
            code[i] += (char) ((int) ch1 + i);
        }
        return new String(code);
    }
}
