package lr10.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class LessonJSON {
    private static final String FILE_PATH = "lessons.json";
    private static JSONArray lessons;

    public static void main(String[] args) {
        try {
            loadJSON();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\n1. Добавить предмет\n2. Поиск по преподавателю\n3. Удалить по названию\n4. Выход");
                int choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1) {
                    addLesson(scanner);
                    saveJSON();
                } else if (choice == 2) {
                    searchLesson(scanner);
                } else if (choice == 3) {
                    deleteLesson(scanner);
                    saveJSON();
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void loadJSON() throws Exception {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(FILE_PATH)) {
            JSONObject obj = (JSONObject) parser.parse(reader);
            lessons = (JSONArray) obj.get("lessons");
        } catch (Exception e) {
            lessons = new JSONArray();
            addSampleData();
            saveJSON();
        }
    }

    private static void addSampleData() {
        addLessonElement("Математика", "Иванов И.И.", "8:00");
        addLessonElement("Физика", "Петров П.П.", "10:00");
    }

    private static void addLessonElement(String name, String teacher, String time) {
        JSONObject lesson = new JSONObject();
        lesson.put("name", name);
        lesson.put("teacher", teacher);
        lesson.put("time", time);
        lessons.add(lesson);
    }

    private static void addLesson(Scanner scanner) {
        System.out.print("Название: ");
        String name = scanner.nextLine();
        System.out.print("Преподаватель: ");
        String teacher = scanner.nextLine();
        System.out.print("Время: ");
        String time = scanner.nextLine();
        addLessonElement(name, teacher, time);
        System.out.println("Предмет добавлен");
    }

    private static void searchLesson(Scanner scanner) {
        System.out.print("Введите преподавателя: ");
        String teacher = scanner.nextLine();

        for (Object obj : lessons) {
            JSONObject lesson = (JSONObject) obj;
            if (teacher.equals(lesson.get("teacher"))) {
                System.out.println("Название: " + lesson.get("name") + ", Время: " + lesson.get("time"));
            }
        }
    }

    private static void deleteLesson(Scanner scanner) {
        System.out.print("Название предмета для удаления: ");
        String name = scanner.nextLine();

        Iterator iterator = lessons.iterator();
        while (iterator.hasNext()) {
            JSONObject lesson = (JSONObject) iterator.next();
            if (name.equals(lesson.get("name"))) {
                iterator.remove();
                System.out.println("Удалено");
                return;
            }
        }
        System.out.println("Не найдено");
    }

    private static void saveJSON() {
        try (FileWriter file = new FileWriter(FILE_PATH)) {
            JSONObject obj = new JSONObject();
            obj.put("lessons", lessons);
            file.write(obj.toJSONString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}