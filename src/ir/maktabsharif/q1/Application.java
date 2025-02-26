package ir.maktabsharif.q1;

import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> myLinkedList = new LinkedList<>();
        //isEmpty
        System.out.println("\nexecuting the isEmpty Method:\n" + myLinkedList.isEmpty());
        System.out.println();
        //add(element)
        System.out.println("executing the add(element) Method:");
        myLinkedList.add("amirali");
        myLinkedList.add("shafizad");
        myLinkedList.add("hw10");
        myLinkedList.add("maktab");
        myLinkedList.add("sharif");
        myLinkedList.add("127");
        System.out.println(myLinkedList);
        System.out.println();
        //add(index, element)
        System.out.println("executing the add(index, element) Method for \"index number 6\" element in index number 6:");
        myLinkedList.add(6, "index number 6");
        System.out.println(myLinkedList);
        System.out.println();
        //remove(element)
        System.out.println("executing the remove(element) Method for \"index number 6\" element:");
        myLinkedList.remove("index number 6");
        System.out.println(myLinkedList);
        System.out.println();
        //remove(index)
        System.out.println("executing the remove(index) Method for index number 5:");
        myLinkedList.remove(5);
        System.out.println(myLinkedList);
        System.out.println();
        //indexOf(element)
        System.out.println("executing the indextOf(element) Method for \"sharif\" element:");
        System.out.println(myLinkedList.indexOf("sharif"));


    }
}
