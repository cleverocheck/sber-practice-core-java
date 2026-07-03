package core.practice.sber;

public class LinkedList<T> {
    private Node<T> head;
    private int size;
    private final int maxSize;

    public LinkedList() {
        this(Integer.MAX_VALUE);
    }

    public LinkedList(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Max size must be positive");
        }
        this.head = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public int size() {
        return size;
    }

    private void checkSizeLimit() {
        if (size >= maxSize) {
            throw new MaxSizeExceededException("Max size (" + maxSize + ") exceeded. Current size: " + size);
        }
    }

    private void checkGetRemoveIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ElementNotFoundException("Invalid index " + index + " not found. Size: " + size);
        }
    }

    private void checkAddIndex(int index) {
        if (index < 0 || index > size) {
            throw new InvalidIndexException("Invalid index " + index + " for add operation. Valid range: 0 to " + size);
        }
    }

    public void add(T value) {
        checkSizeLimit();
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            findLast().setNext(newNode);
        }
        size++;
    }

    public Node<T> findLast() {
        if (head == null) return null;
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        return current;
    }

    public T get(int index) {
        checkGetRemoveIndex(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public T remove(int index) {
        checkGetRemoveIndex(index);
        T removedValue;
        if (index == 0) {
            removedValue = head.getValue();
            head = head.getNext();
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            removedValue = current.getNext().getValue();
            current.setNext(current.getNext().getNext());
        }
        size--;
        return removedValue;
    }

    public void add(int index, T value) {
        checkAddIndex(index);
        checkSizeLimit();
        if (index == 0) {
            head = new Node<>(value, head);
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(new Node<>(value, current.getNext()));
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            sb.append(current.getValue());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}