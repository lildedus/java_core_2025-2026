package lr7.example5;

public class SubClassTask5_2 extends SuperClassTask5{
    protected char aChar;

    public SubClassTask5_2(String str, char aChar) {
        super(str);
        this.aChar = aChar;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + '{' +
                "str = '" + getStr() + '\'' +
                ", aChar = '" + aChar +'\''+
                '}';
    }
}
