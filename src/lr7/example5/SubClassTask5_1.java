package lr7.example5;

public class SubClassTask5_1 extends SuperClassTask5{
    protected int num;

    public SubClassTask5_1(String str, int num) {
        super(str);
        this.num = num;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + '{' +
                "str = '"+ getStr() +'\''+
                ", num = " + num +
                '}';
    }
}
