package lr10.task1;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LessonXML {
    private static final String FILE_PATH = "lessons.xml";
    private static Document doc;
    private static Element root;

    public static void main(String[] args) {
        try {
            loadOrCreateXML();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\n1. Добавить предмет\n2. Поиск по преподавателю или часу\n3. Удалить по названию\n4. Выход");
                int choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1) addLesson(scanner);
                else if (choice == 2) searchLesson(scanner);
                else if (choice == 3) deleteLesson(scanner);
                else break;
            }
            saveXML();
        } catch (Exception e) { e.printStackTrace(); }
    }

    private static void loadOrCreateXML() throws Exception {
        File file = new File(FILE_PATH);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        if (file.exists()) {
            doc = db.parse(file);
            root = doc.getDocumentElement();
        } else {
            doc = db.newDocument();
            root = doc.createElement("lessons");
            doc.appendChild(root);
            addSampleData();
            saveXML();
        }
        doc.getDocumentElement().normalize();
    }

    private static void addSampleData() {
        addLessonElement("Математика", "Иванов И.И.", "8:00");
        addLessonElement("Физика", "Петров П.П.", "10:00");
    }

    private static void addLessonElement(String name, String teacher, String time) {
        Element lesson = doc.createElement("lesson");
        Element n = doc.createElement("name"); n.setTextContent(name); lesson.appendChild(n);
        Element t = doc.createElement("teacher"); t.setTextContent(teacher); lesson.appendChild(t);
        Element tm = doc.createElement("time"); tm.setTextContent(time); lesson.appendChild(tm);
        root.appendChild(lesson);
    }

    private static void addLesson(Scanner scanner) {
        System.out.print("Название: "); String name = scanner.nextLine();
        System.out.print("Преподаватель: "); String teacher = scanner.nextLine();
        System.out.print("Время (час): "); String time = scanner.nextLine();
        addLessonElement(name, teacher, time);
        saveXML();
        System.out.println("Предмет добавлен");
    }

    private static void searchLesson(Scanner scanner) {
        System.out.print("Искать по (teacher/time): "); String type = scanner.nextLine();
        System.out.print("Значение: "); String value = scanner.nextLine();
        NodeList nodeList = doc.getElementsByTagName("lesson");
        List<Element> lessons = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) lessons.add((Element) node);
        }
        List<Element> result = lessons.stream().filter(lesson -> {
            if (type.equals("teacher")) return lesson.getElementsByTagName("teacher").item(0).getTextContent().equalsIgnoreCase(value);
            else if (type.equals("time")) return lesson.getElementsByTagName("time").item(0).getTextContent().equals(value);
            return false;
        }).collect(Collectors.toList());
        for (Element e : result) {
            System.out.println("Название: " + e.getElementsByTagName("name").item(0).getTextContent() +
                    ", Преподаватель: " + e.getElementsByTagName("teacher").item(0).getTextContent() +
                    ", Время: " + e.getElementsByTagName("time").item(0).getTextContent());
        }
    }

    private static void deleteLesson(Scanner scanner) {
        System.out.print("Название предмета для удаления: "); String name = scanner.nextLine();
        NodeList nodeList = doc.getElementsByTagName("lesson");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element lesson = (Element) nodeList.item(i);
            String title = lesson.getElementsByTagName("name").item(0).getTextContent();
            if (title.equalsIgnoreCase(name)) {
                lesson.getParentNode().removeChild(lesson);
                System.out.println("Удалено");
                saveXML();
                return;
            }
        }
        System.out.println("Не найдено");
    }

    private static void saveXML() {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(FILE_PATH));
            transformer.transform(source, result);
        } catch (Exception e) { e.printStackTrace(); }
    }
}