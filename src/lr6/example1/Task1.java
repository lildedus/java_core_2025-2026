package lr6.example1;

public class Task1 {
    private char aChar;
    private String str;

    public char getaChar() {
        return aChar;
    }

    public String getStr() {
        return str;
    }

    public void setValues(char aChar) {
        this.aChar = aChar;
        this.str = null;
    }
    public void setValues(String str) {
        this.str = str;
        this.aChar = '\0';
    }
    public void setValues(char[] charValue) {
        if (charValue != null && charValue.length == 1) {
            this.aChar = charValue[0];
            this.str = null;
        } else if(charValue != null && charValue.length > 0){
            this.str = new String(charValue);
            this.aChar = '\0';
        } else {
            this.aChar = '\0';
            this.str = null;
        }
    }
}

