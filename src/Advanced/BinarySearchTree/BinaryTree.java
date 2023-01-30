package Advanced.BinarySearchTree;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;


    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    private void addAsRoot(Node<T> node) {
        this.root = node;
    }

    public void add(T data) {
        if (isEmpty()) {
            addAsRoot(new Node<T>(data, null, null));
        } else {
            add(data, root);
        }
    }

    private void add(T data, Node<T> newRoot) {
        int compareErg = data.compareTo(newRoot.data); // 0 if equals, <0 if data < newRoot.data, >0 if data > newRoot.data

        if (compareErg == 0) {
            return;
        }
        if (compareErg > 0) {
            if (newRoot.right == null) {
                newRoot.right = new Node(data, null, null);
            } else {
                add(data, newRoot.right);
            }
        } else {
            if (newRoot.left == null) {
                newRoot.left = new Node(data, null, null);
            } else {
                add(data, newRoot.left);
            }
        }
    }

    public String traversePreOder() {
        if (isEmpty()) {
            return "Tree is empty!!";
        } else {
            return traversePreOder(root);
        }
    }

    private String traversePreOder(Node newRoot) {
        // PRE ORDER --> W L R
        String erg = "";

        // WURZEL
        erg += newRoot.data + " ";

        // LEFT
        if (newRoot.left != null) {
            erg += traversePreOder(newRoot.left);
        }

        // RIGHT
        if (newRoot.right != null) {
            erg += traversePreOder(newRoot.right);
        }
        return erg;
    }


    public String traversePostOder() {
        if (isEmpty()) {
            return "Tree is empty!!";
        } else {
            return traversePostOder(root);
        }
    }

    private String traversePostOder(Node newRoot) {
        // POST ORDER --> L R W
        String erg = "";

        // LEFT
        if (newRoot.left != null) {
            erg += traversePostOder(newRoot.left);
        }

        // RIGHT
        if (newRoot.right != null) {
            erg += traversePostOder(newRoot.right);
        }

        // WURZEL
        erg += newRoot.data + " ";

        return erg;
    }

    public String traverseInOder() {
        if (isEmpty()) {
            return "Tree is empty!!";
        } else {
            return traverseInOder(root);
        }
    }

    private String traverseInOder(Node newRoot) {
        // IN ORDER --> L W R
        String erg = "";

        // LEFT
        if (newRoot.left != null) {
            erg += traverseInOder(newRoot.left);
        }


        // WURZEL
        erg += newRoot.data + " ";

        // RIGHT
        if (newRoot.right != null) {
            erg += traverseInOder(newRoot.right);
        }
        return erg;
    }

    public boolean searchIte(T data) {
        if (isEmpty()) {
            return false;
        } else {
            Node<T> ptr = root;
            while (ptr != null) {
                int compareResult = data.compareTo(ptr.data);
                if (compareResult == 0) {
                    return true;
                } else if (compareResult < 0) {
                    ptr = ptr.left;
                } else {
                    ptr = ptr.right;
                }
            }
        }
        return false;
    }


    public boolean search(T data) {
        if (isEmpty()) {
            return false;
        } else {
            return search(data, root);
        }
    }

    private boolean search(T data, Node<T> newRoot) {
        if (newRoot == null) {
            return false;
        }
        int compareErg = data.compareTo(newRoot.data);
        if (compareErg == 0) {
            return true;
        } else if (compareErg > 0) {
            return search(data, newRoot.right);
        } else {
            return search(data, newRoot.left);
        }
    }

    public int anzahlKnoten() {
        if (isEmpty()) {
            return 0;
        } else {
            return anzahlKnoten(root);
        }
    }

    private int anzahlKnoten(Node<T> newRoot) {
        if (newRoot == null) {
            return 0;
        } else {
            return anzahlKnoten(newRoot.left) + anzahlKnoten(newRoot.right) + 1;
        }
    }

    public int anzahlBlätter() {
        if (isEmpty()) {
            return 0;
        } else {
            return anzahlBlätter(root);
        }
    }

    public int anzahlBlätter(Node<T> newRoot) {
        if (newRoot == null) {
            return 0;
        }
        if (newRoot.left == null && newRoot.right == null) {
            return 1;
        } else {
            return anzahlBlätter(newRoot.left) + anzahlBlätter(newRoot.right);
        }
    }


    public int hohe() {
        if (isEmpty()) {
            return 0;
        } else {
            return hohe(root) - 1;
        }
    }

    public int hohe(Node<T> root) {
        if (root == null) {
            return 0;
        } else {
            int hoheLinks = hohe(root.left);
            int hoheRechts = hohe(root.right);

            if (hoheLinks > hoheRechts) {
                return hoheLinks + 1;
            } else {
                return hoheRechts + 1;
            }
        }
    }
}
