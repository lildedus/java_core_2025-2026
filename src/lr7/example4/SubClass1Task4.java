package lr7.example4;

public class SubClass1Task4 extends SuperClassTask4{
    public String str;

    public SubClass1Task4(char aChar, String str) {
        super(aChar);
        this.str = str;
    }

    public SubClass1Task4(SubClass1Task4 other) {
        super(other.aChar);
        this.str = other.str;
    }


}
