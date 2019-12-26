package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;

import static sun.plugin.util.ProgressMonitor.get;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cat[]> list = new ArrayList<>();
        LinkedList<Cat[]> catList = new LinkedList<>();
        Cat[] cats = new Cat[1000000];
        for (int i = 1; i <= 1000000; i++)
            if (i < 1000000) ;
        list.add(cats);
        catList.add(cats);
        System.out.println(catList);
        System.out.println(list);
        for (Cat c : cats)
            System.out.println(c);
        addFirst(100);
        System.out.println(LocalDateTime.now());
        for (int i = 500000; i >= 1000000; i++) ;
        System.out.println(LocalDateTime.now());
        get();

    }

    private static void addFirst(int i) {
    }
}
class Cat{
    public Cat() {
    }

}
