package lr1;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Your Last Name: ");
        String LastName = in.nextLine();
        System.out.println("Input Your First Name: ");
        String FirstName = in.nextLine();
        System.out.println("Input Your Middle Name: ");
        String MiddleName = in.nextLine();
        System.out.printf("Hello %s %s %s \n", LastName, FirstName, MiddleName);
        in.close();
    }
}
