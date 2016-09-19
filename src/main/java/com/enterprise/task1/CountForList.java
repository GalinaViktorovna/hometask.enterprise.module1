package com.enterprise.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CountForList {
    private final static int ATTEMPTS = 100;
    List<Integer> fullList;
    List<Integer> list;
    int counter;

    public CountForList(ArrayList<Integer> arrayList, int count) {
        this.list = arrayList;
        this.counter = count;
        this.fullList = new ArrayList<>();
    }

    public CountForList(LinkedList<Integer> linkedList, int count) {
        this.list = linkedList;
        this.counter = count;
        this.fullList = new LinkedList<>();
    }

    private void fillList() {
        while (fullList.size() < counter) {
            fullList.add(1);
        }
    }

    public double add() {
        double currentAttempts = 0;
        double sum = 0;
        while (ATTEMPTS > currentAttempts) {
            long startCount = System.nanoTime();
            for (int i = 0; i < counter; i++) {
                list.add(i, 1);
            }
            long finishCount = System.nanoTime();
            sum += finishCount - startCount;
            currentAttempts++;
            list.clear();
        }
        return sum / ATTEMPTS;
    }

    public double get() {
        double currentAttempts = 0;
        double sum = 0;

        while (ATTEMPTS > currentAttempts) {
            fillList();
            long startCount = System.nanoTime();
            for (int i = 0; i < counter; i++) {
                fullList.get(6);
            }
            long finishCount = System.nanoTime();
            sum += finishCount - startCount;
            currentAttempts++;
        }
        return sum / ATTEMPTS;
    }

    public double remove() {
        double currentAttempts = 0;
        double sum = 0;
        while (ATTEMPTS > currentAttempts) {
            fillList();
            long startCount = System.nanoTime();
            for (int i = 0; i < fullList.size(); i++) {
                fullList.remove(i);
            }
            long finishCount = System.nanoTime();
            sum += finishCount - startCount;
            currentAttempts++;
        }
        return sum / ATTEMPTS;
    }

    public double contain() {
        double currentAttempts = 0;
        double sum = 0;
        while (ATTEMPTS > currentAttempts) {
            fillList();
            long startCount = System.nanoTime();
            fullList.contains(2);
            long finishCount = System.nanoTime();
            sum += finishCount - startCount;
            currentAttempts++;
        }
        return sum / ATTEMPTS;
    }

    public double addIterator() {
        double currentAttempts = 0;
        double sum = 0;
        while (ATTEMPTS > currentAttempts) {
            ListIterator<Integer> listIterator = list.listIterator();
            long startCount = System.nanoTime();
            for (int i = 0; i < counter; i++) {
                listIterator.add(i);
            }
            long finishCount = System.nanoTime();
            sum += finishCount - startCount;
            currentAttempts++;
            list.clear();
        }
        return sum / ATTEMPTS;
    }

    public double removeIterator() {
        double currentAttempts = 0;
        double sum = 0;
        while (ATTEMPTS > currentAttempts) {
            fillList();
            ListIterator<Integer> fullListIterator = fullList.listIterator();
            long startCount = System.nanoTime();
            if (fullListIterator.next() == 1) fullListIterator.remove();
            long finishCount = System.nanoTime();
            sum += finishCount - startCount;
            currentAttempts++;
        }
        return sum / ATTEMPTS;
    }
}
