package lr9.Task8;

public class LinkedListCustom {
    private Node head;  // голова списка

    //  МЕТОДЫ С ИСПОЛЬЗОВАНИЕМ ЦИКЛА

    // а) ввод с головы (создание списка с головы)
    public void createHead(int[] values) {
        head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node(values[i], head);
        }
    }

    // ввод с хвоста (создание списка с хвоста)
    public void createTail(int[] values) {
        head = null;
        if (values.length == 0) return;

        head = new Node(values[0], null);
        Node tail = head;

        for (int i = 1; i < values.length; i++) {
            tail.next = new Node(values[i], null);
            tail = tail.next;
        }
    }

    // вывод (возвращается строка, сформированная из элементов списка)
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;

        sb.append("[");
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");

        return sb.toString();
    }

    // добавление элемента в начало списка
    public void addFirst(int value) {
        head = new Node(value, head);
    }

    // добавление элемента в конец списка
    public void addLast(int value) {
        if (head == null) {
            head = new Node(value, null);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value, null);
    }

    // вставка элемента в список с указанным номером
    public void insert(int value, int position) {
        if (position <= 0 || head == null) {
            addFirst(value);
            return;
        }

        Node current = head;
        int index = 1;

        while (current.next != null && index < position) {
            current = current.next;
            index++;
        }

        current.next = new Node(value, current.next);
    }

    // удаление элемента с головы списка
    public int removeFirst() {
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }

        int value = head.value;
        head = head.next;
        return value;
    }

    // удаление последнего элемента списка
    public int removeLast() {
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }

        if (head.next == null) {
            int value = head.value;
            head = null;
            return value;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        int value = current.next.value;
        current.next = null;
        return value;
    }

    // удаление из списка элемента с указанным номером
    public int remove(int position) {
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }

        if (position <= 0) {
            return removeFirst();
        }

        Node current = head;
        int index = 1;

        while (current.next != null && index < position) {
            current = current.next;
            index++;
        }

        if (current.next == null) {
            throw new IndexOutOfBoundsException("Позиция не найдена");
        }

        int value = current.next.value;
        current.next = current.next.next;
        return value;
    }

    // МЕТОДЫ С ИСПОЛЬЗОВАНИЕМ РЕКУРСИИ

    // ввод с головы (рекурсивно)
    public void createHeadRec(int[] values) {
        head = createHeadRecHelper(values, values.length - 1);
    }

    private Node createHeadRecHelper(int[] values, int index) {
        if (index < 0) {
            return null;
        }
        return new Node(values[index], createHeadRecHelper(values, index - 1));
    }

    // ввод с хвоста (рекурсивно)
    public void createTailRec(int[] values) {
        head = createTailRecHelper(values, 0);
    }

    private Node createTailRecHelper(int[] values, int index) {
        if (index >= values.length) {
            return null;
        }
        return new Node(values[index], createTailRecHelper(values, index + 1));
    }

    // вывод (рекурсивно)
    public String toStringRec() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        toStringRecHelper(head, sb);
        sb.append("]");
        return sb.toString();
    }

    private void toStringRecHelper(Node node, StringBuilder sb) {
        if (node == null) {
            return;
        }

        sb.append(node.value);
        if (node.next != null) {
            sb.append(", ");
        }
        toStringRecHelper(node.next, sb);
    }
}