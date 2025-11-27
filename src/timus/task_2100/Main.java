package timus.task_2100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputFileName = "src/timus/task_2100/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)):
                            new BufferedReader(new FileReader(inputFileName));
            String readLine;
            int friends = 0;
            int pairs = 0;
            while ((readLine = bufferedReader.readLine()) != null){
                if(friends == 0){
                    friends = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")){
                    pairs++;
                }
            }
            int result;
            int guests = (2 + friends+pairs);
            if (guests == 13){
                result = (guests*100)+100;
            } else {
                result = guests*100;
            }
            System.out.println(result);
        } catch (IOException exception){
            exception.printStackTrace();
        }

    }
}
