package com.enterprise.task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CountForSet {
    private final static int ATTEMPTS = 100;
    Set<Integer> fullSet;
    Set<Integer> set;
    int counter;

    public CountForSet(HashSet<Integer> set, int counter) {
        this.set = set;
        this.counter = counter;
        this.fullSet = new HashSet<>();
    }

    public CountForSet(TreeSet<Integer> set, int counter) {
        this.set = set;
        this.counter = counter;
        this.fullSet = new TreeSet<>();
    }

    private void fillSet() {
        for (int i = counter; counter < fullSet.size(); i++) {
            fullSet.add(i);

        }
    }

    public double add() {
        double currentAttempts = 0;
        double sum = 0;
        while (ATTEMPTS > currentAttempts) {
            long startCount = System.nanoTime();
            for (int i = 0; i < counter; i++) {
                set.add(i);
            }
            long finishCount = System.nanoTime();
            sum += finishCount - startCount;
            currentAttempts++;
            set.clear();
        }
        return sum / ATTEMPTS;
    }

    public double remove() {
        double currentAttempts = 0;
        double sum = 0;
        fillSet();
        while (ATTEMPTS > currentAttempts) {
           // fillSet();
            long startCount = System.nanoTime();
            Iterator<Integer> iterator = fullSet.iterator();
            while (iterator.hasNext()) {
                Integer element = iterator.next();
                if (element % 2 == 0) {
                    iterator.remove();
                }
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
            fillSet();
            long startCount = System.nanoTime();
            fullSet.contains(2);
            long finishCount = System.nanoTime();
            sum += finishCount - startCount;
            currentAttempts++;
        }
        return sum / ATTEMPTS;
    }

}


//    add(value)
//    remove(value)
//    contains(value)

