package Advanced.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // MY LINKED LIST
        System.out.println("My Linked list: ");
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        System.out.println("Tyr to print --> " + myLinkedList);

        try {
            System.out.print("Tyr to get index 0 --> ");
            System.out.println("Get value in index 100 --> " + myLinkedList.get(0));
        } catch (InvalidIndexException | MyListIsEmptyException e) {
            System.out.println(e.getMessage());
        }
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);


        System.out.println("is Empty --> " + myLinkedList.isEmpty());
        System.out.println(myLinkedList);
        System.out.println("Is 2 contains in the list --> " + myLinkedList.contains(2));
        System.out.println("Is 10 contains in the list --> " + myLinkedList.contains(10));
        myLinkedList.add(2, 5);
        System.out.println("After insert: " + myLinkedList);

        try {
            System.out.println("Get value in index 0 --> " + myLinkedList.get(0));
        } catch (InvalidIndexException | MyListIsEmptyException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Get value in index -2 --> " + myLinkedList.get(-2));
        } catch (InvalidIndexException | MyListIsEmptyException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Get value in index 2 --> " + myLinkedList.get(2));
        } catch (InvalidIndexException | MyListIsEmptyException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Get value in index 100 --> " + myLinkedList.get(100));
        } catch (InvalidIndexException | MyListIsEmptyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Remove value 1 --> " + myLinkedList.removeValue(1));
        System.out.println("Remove value 10 --> " + myLinkedList.removeValue(10));
        System.out.println("Remove value -100 --> " + myLinkedList.removeValue(-100));
        System.out.println("Remove value 5 --> " + myLinkedList.removeValue(5));
        System.out.println("Remove value 4 --> " + myLinkedList.removeValue(4));

        System.out.println("After Remove: " + myLinkedList);


        // JAVA LINKED LIST

        System.out.println("\nJava Linked list: ");
        LinkedList<Integer> javaLinkedList = new LinkedList();
        try {
            System.out.println("Get value in index 100 --> " + javaLinkedList.get(0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        javaLinkedList.add(1);
        javaLinkedList.add(2);
        javaLinkedList.add(3);
        javaLinkedList.add(4);


        System.out.println("is Empty --> " + javaLinkedList.isEmpty());
        System.out.println(javaLinkedList);
        System.out.println("Is 2 contains in the list --> " + javaLinkedList.contains(2));
        System.out.println("Is 10 contains in the list --> " + javaLinkedList.contains(10));
        javaLinkedList.add(2, 5);
        System.out.println("After insert: " + javaLinkedList);


        try {
            System.out.println("Get value in index 0 --> " + javaLinkedList.get(0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Get value in index -2 --> " + javaLinkedList.get(-2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Get value in index 2 --> " + javaLinkedList.get(2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Get value in index 100 --> " + javaLinkedList.get(100));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
