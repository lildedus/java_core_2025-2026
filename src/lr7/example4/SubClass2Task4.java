package lr7.example4;


public class SubClass2Task4 extends SubClass1Task4{
    public int value;

    public SubClass2Task4(char aChar, String str, int value) {
        super(aChar, str);
        this.value = value;
    }

    public SubClass2Task4(SubClass2Task4 other) {
        super(other.aChar, other.str);
        this.value = other.value;
    }
}
