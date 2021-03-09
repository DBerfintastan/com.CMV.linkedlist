package com.CMV;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Node n1 = new Node();
        int secim;
        int childId;
        String childName, childSurname,parent;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Secim giriniz");
        secim = scanner.nextInt();
        for (int i = 0; i < secim; i++) {
            System.out.println("Id giriniz");
            childId = scanner.nextInt();
            System.out.println("Ad giriniz");
            childName = scanner.next();
            System.out.println("Soyad giriniz");
            childSurname = scanner.next();
            System.out.println("Parent giriniz");
            parent = scanner.next();
            n1.ekle(childId, childName, childSurname,parent);
        }
        n1.yazdir();
        System.out.println(n1.toString());
    }

}

