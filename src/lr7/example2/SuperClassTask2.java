package lr7.example2;

public class SuperClassTask2 {
    private String str1;

    SuperClassTask2 (String str1){
        this.str1 = str1;
    }

    public void setStr1(){
        this.str1 = "null";
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public int getStr1Length(){
        return str1.length();
    }


}
