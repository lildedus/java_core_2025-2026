package lr7.example4;

public class SuperClassTask4 {
    public char aChar;
    SuperClassTask4(char aChar){
        this.aChar = aChar;

    }
    SuperClassTask4(SuperClassTask4 other){
        this.aChar = other.aChar;
    }
}
