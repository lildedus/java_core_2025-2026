package lr8.Task2;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        String inputFile = "input_data.bin";
        String outputFile = "output_data.bin";

        System.out.println("=== СОЗДАНИЕ И ФИЛЬТРАЦИЯ ДАННЫХ ===");
        System.out.println("Текущая директория: " + new File(".").getAbsolutePath());

        try {
            // 1. Создание исходного файла
            createInputFile(inputFile);

            // 2. Фильтрация данных
            filterData(inputFile, outputFile);

            // 3. Вывод результатов
            displayResults(inputFile, outputFile);

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }

    private static void createInputFile(String filename) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeUTF("Первая строка UTF-8");
            dos.writeUTF("Вторая строка UTF-8");
            dos.writeDouble(3.14);
            dos.writeDouble(-2.5);
            dos.writeDouble(1.618);
            dos.writeDouble(-0.577);
            dos.writeDouble(1.414);
            System.out.println("Создан файл: " + filename);
        }
    }

    private static void filterData(String inputFile, String outputFile) throws IOException {
        String secondString = "";
        int count = 0;
        double[] positives = new double[5];

        try (DataInputStream dis = new DataInputStream(new FileInputStream(inputFile))) {
            dis.readUTF(); // Пропускаем первую строку
            secondString = dis.readUTF(); // Сохраняем вторую

            for (int i = 0; i < 5; i++) {
                double num = dis.readDouble();
                if (num > 0) {
                    positives[count++] = num;
                }
            }
        }

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(outputFile))) {
            dos.writeUTF(secondString);
            for (int i = 0; i < count; i++) {
                dos.writeDouble(positives[i]);
            }
            System.out.println("Создан файл: " + outputFile);
            System.out.println("Положительных чисел: " + count);
        }
    }

    private static void displayResults(String inputFile, String outputFile) throws IOException {
        System.out.println("\n--- Исходный файл ---");
        try (DataInputStream dis = new DataInputStream(new FileInputStream(inputFile))) {
            System.out.println("Строка 1: " + dis.readUTF());
            System.out.println("Строка 2: " + dis.readUTF());
            System.out.print("Числа: ");
            for (int i = 0; i < 5; i++) {
                System.out.printf("%.3f ", dis.readDouble());
            }
            System.out.println();
        }

        System.out.println("\n--- Результирующий файл ---");
        try (DataInputStream dis = new DataInputStream(new FileInputStream(outputFile))) {
            System.out.println("Строка: " + dis.readUTF());
            System.out.print("Числа: ");
            try {
                while (true) {
                    System.out.printf("%.3f ", dis.readDouble());
                }
            } catch (EOFException e) {
                System.out.println("\n--- Конец файла ---");
            }
        }
    }
}