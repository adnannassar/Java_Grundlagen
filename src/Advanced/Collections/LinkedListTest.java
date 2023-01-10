package Advanced.Collections;

import OOP.BVB09.Mitglied;
import OOP.Vererbung.Example1.Person;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        System.out.println("integerLinkedList: " + integerLinkedList + ", size = " + integerLinkedList.size());

        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);

        System.out.println("integerLinkedList: " + integerLinkedList + ", size = " + integerLinkedList.size());
        System.out.println("Search for 1: " + integerLinkedList.contains(1));
        System.out.println("Search for 7: " + integerLinkedList.contains(7));
        integerLinkedList.remove(1); // remove index 1
        System.out.println("Remove index 1: " + integerLinkedList + ", size = " + integerLinkedList.size());

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.addAll(integerLinkedList);
        System.out.println("linkedList2: " + linkedList2 + ", size = " + linkedList2.size());
    }

}
