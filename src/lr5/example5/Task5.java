package lr5.example5;

public class Task5 {
    private int num;
    public Task5() {
        setNum();
    }
    public Task5(int num) {
        setNum(num);
    }
    public void setNum(){
        this.num = 0;
    }
    public void setNum(int num) {
        if (num<=100) {
            this.num = num;
            System.out.println("Введенное число:");
        } else {
            this.num = 100;
            System.out.println("Введенное значение больше 100!");
        }
    }
    public int getNum() {
        return num;
    }
}
