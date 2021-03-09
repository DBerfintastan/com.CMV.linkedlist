package com.CMV;
import java.util.*;
public class Node {
    int id;
    String name;
    String surname;
    String parent;
    public Node() {
    }

    public Node(int id, String name, String surname,String parent) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.parent=parent;
    }

    LinkedList<Node> children = new LinkedList<Node>();

    public void ekle(int childID, String childName, String childSurname, String parent) {
        Node child = new Node(childID, childName, childSurname,parent);
        children.add(child);
    }

    public void yazdir() {
        for (Node child : children) {
            System.out.println("Child:  " + child.name + " " + child.surname + " Parent:"+ child.parent);
        }
    }

    @Override
    public String toString() {
        return "Node [id=" + id + ", name=" + name + ", surname=" + surname + ", children=" + children + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }


}
