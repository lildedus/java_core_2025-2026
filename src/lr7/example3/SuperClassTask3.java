package lr7.example3;

public class SuperClassTask3 {
    public int num;

    SuperClassTask3 (int num) {
        this.num = num;
    }

    public void setValues(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+'{' +
                "num = " + num +
                '}';
    }
}
