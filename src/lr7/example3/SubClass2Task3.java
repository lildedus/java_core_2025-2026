package lr7.example3;

public class SubClass2Task3 extends SubClassTask3 {
    public String str;
    SubClass2Task3(int num, char aChar, String str) {
        super (num, aChar);
        this.str = str;
    }
    public void setValues(int num, char aChar, String str){
        this.str = str;
        super.setValues(num,aChar);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+'{' +
                "num = " + num +
                ", aChar = '" + aChar +
                "', str = '" + str + '\'' +
                '}';
    }
}
