package lr7.example3;

public class SubClassTask3 extends SuperClassTask3 {
    public char aChar;
    SubClassTask3(int num, char aChar) {
        super(num);
        this.aChar = aChar;
    }
    public void setValues(int num, char aChar) {
        super.setValues(num);
        this.aChar = aChar;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+'{' +
                "num = " + num +
                ", aChar = '" + aChar +
                '\''+'}';
    }
}
