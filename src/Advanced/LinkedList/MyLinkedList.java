package Advanced.LinkedList;

public class MyLinkedList<T> {
    private Node head;
    private int anzahl;

    public int getAnzahl() {
        return anzahl;
    }

    public boolean isEmpty() {
        if (anzahl == 0 || head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(T value) {
        Node newNode = new Node(value, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
        anzahl++;
    }


    public void add(int pos, T value) {
        Node newNode = new Node(value, null);
        if (pos < 0) {
            System.out.println("Pos: (" + pos + ") ist ungültig!");
        } else {
            if (pos == 0) {
                if (isEmpty()) {
                    add(value);
                } else {
                    newNode.next = head;
                    head = newNode;
                }
            } else if (pos >= anzahl) {
                Node ptr = head;
                while (ptr.next != null) {
                    ptr = ptr.next;
                }
                ptr.next = newNode;
            } else {
                Node ptr = head;
                int i = 1;
                while (i != pos) {
                    ptr = ptr.next;
                    i++;
                }
                newNode.next = ptr.next;
                ptr.next = newNode;
            }
            anzahl++;
        }
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            String erg = "[";
            Node ptr = head;
            while (ptr.next != null) {
                erg += ptr.value + ", ";
                ptr = ptr.next;
            }
            erg += ptr.value + "]";
            return erg;
        } else {
            return "List is empty!";
        }

    }

    public boolean contains(T data) {
        if (isEmpty()) {
            return false;
        } else {
            Node ptr = head;
            while (ptr != null) {
                if (ptr.value.equals(data)) {
                    return true;
                }
                ptr = ptr.next;
            }
            return false;
        }
    }

    public T get(int pos) throws MyListIsEmptyException, InvalidIndexException {
        if (isEmpty()) {
            throw new MyListIsEmptyException("List ist empty!");
        } else if (pos < 0 || pos > anzahl) {
            throw new InvalidIndexException("Index ist invalid!");
        } else if (pos == 0) {
            return (T) head.value;
        } else {
            Node ptr = head;
            int i = 0;
            while (i != pos) {
                i++;
                ptr = ptr.next;
            }
            return (T) ptr.value;
        }
    }

    public boolean removeValue(T value) {
        if (!isEmpty()) {
            if (value == head.value) {
                head = head.next;
                return true;
            } else {
                Node ptr = head;
                Node before_ptr = head;
                while (ptr != null) {
                    if (ptr.value.equals(value)) {
                        before_ptr.next = ptr.next;
                        ptr.next = null;
                        return true;
                    }
                    before_ptr = ptr;
                    ptr = ptr.next;
                }
                return false;
            }
        }
        return false;
    }

    public void removeIndex(int pos) {

    }
}
