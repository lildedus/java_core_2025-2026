package lr5.example6;

public class Task6 {
    private int max;
    private int min;

    public Task6() {
        this.min = 0;
        this.max = 0;
    }

    public Task6(int value) {
        this.max = value;
        this.min = value;
    }

    public Task6(int value1, int value2) {
        if (value1 >= value2) {
            this.max = value1;
            this.min = value2;
        } else {
            this.max = value2;
            this.min = value1;
        }
    }

    public void setValues(int value) {
        this.max = Math.max(this.max,value);
        this.min = Math.min(this.min,value);
    }

    public void setValues(int value1, int value2) {
        int maxCandidate = Math.max(value1, value2);
        this.max = Math.max(this.max, maxCandidate);
        int absMin = Math.min(value1, value2);
        this.min = Math.min(this.min, absMin);
    }

    public void output() {
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
    }
}
