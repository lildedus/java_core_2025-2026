package timus.second_semestr;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class num_1837 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, Integer> nameToId = new HashMap<>();
        String[][] matches = new String[n][3];
        int idCounter = 0;
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            String[] names = line.split(" ");
            matches[i] = names;
            for (String name : names) {
                if (!nameToId.containsKey(name)) {
                    nameToId.put(name, idCounter++);
                }
            }
        }
        int[][] graph = new int[idCounter][idCounter];
        for (int i = 0; i < idCounter; i++) {
            Arrays.fill(graph[i], 1000000);
            graph[i][i] = 0;
        }
        for (String[] match : matches) {
            int a = nameToId.get(match[0]);
            int b = nameToId.get(match[1]);
            int c = nameToId.get(match[2]);
            graph[a][b] = 1;
            graph[b][a] = 1;
            graph[a][c] = 1;
            graph[c][a] = 1;
            graph[b][c] = 1;
            graph[c][b] = 1;
        }
        for (int k = 0; k < idCounter; k++) {
            for (int i = 0; i < idCounter; i++) {
                for (int j = 0; j < idCounter; j++) {
                    if (graph[i][j] > graph[i][k] + graph[k][j]) {
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }
        int isenbaevId = nameToId.containsKey("Isenbaev") ? nameToId.get("Isenbaev") : -1;
        String[] names = new String[idCounter];
        for (String name : nameToId.keySet()) {
            names[nameToId.get(name)] = name;
        }
        Arrays.sort(names);
        for (String name : names) {
            int id = nameToId.get(name);
            if (isenbaevId == -1) {
                System.out.println(name + " undefined");
            } else if (graph[isenbaevId][id] >= 1000000) {
                System.out.println(name + " undefined");
            } else {
                System.out.println(name + " " + graph[isenbaevId][id]);
            }
        }
        in.close();
    }
}