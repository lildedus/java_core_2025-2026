package lr7.example2;

public class SubClassTask2 extends SuperClassTask2{
    public int num;

    public SubClassTask2(int num, String str1) {
        super(str1);
        this.num = num;
    }

    @Override
    public void setStr1() {
        super.setStr1("null");
        this.num = 0;
    }

    public void setStr1(String str1){
        super.setStr1(str1);
        this.num = -1;
    }
    public void setStr1(int num) {
        this.num = num;
    }
    public void setStr1(String str1, int num){
        super.setStr1(str1);
        this.num = num;
    }

}
