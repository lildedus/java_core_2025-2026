package lr7.example5;

public class SuperClassTask5 {
    private String str;

    SuperClassTask5(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + '{' +
                "str = '" + str + '\'' +
                '}';
    }
}
