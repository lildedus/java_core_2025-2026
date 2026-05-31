package timus.second_semestr;

import java.util.Scanner;

public class num_1893 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String seat = in.nextLine();
        int i = Integer.parseInt(seat.substring(0, seat.length() - 1));
        char j = seat.charAt(seat.length() - 1);
        if (i >= 1 && i <= 2) {
            if (j == 'A' || j == 'D') {
                System.out.println("window");
            } else {
                System.out.println("aisle");
            }
        } else if (i >= 3 && i <= 20) {
            if (j == 'A' || j == 'F') {
                System.out.println("window");
            } else if (j == 'B' || j == 'C' || j == 'D' || j == 'E') {
                System.out.println("aisle");
            } else {
                System.out.println("neither");
            }
        } else {
            if (j == 'A' || j == 'K') {
                System.out.println("window");
            } else if (j == 'C' || j == 'D' || j == 'G' || j == 'H') {
                System.out.println("aisle");
            } else {
                System.out.println("neither");
            }
        }
        in.close();
    }
}