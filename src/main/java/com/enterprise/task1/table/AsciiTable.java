package com.enterprise.task1.table;

import java.util.Arrays;
import java.util.List;

public class AsciiTable implements Table {

    private int height;
    private int weight;
    private String[][] table;

    public AsciiTable(int height, int weight) {
        this.height = height;
        this.weight = weight;
        this.table = new String[height][weight];

    }

    @Override
    public void setHeaders(List<String> list) {
        try {
            int i = 0;
            for (int j = 0; j < this.weight; j++) {
                table[i][j] = list.get(j);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Your list with HeadLine for table is empty or deficiency full");
        }
    }

    @Override
    public void setCell(List<String> list) {
        try {
            for (int i = 1, k = 0; i < height; i++) {
                for (int j = 0; j < weight; j++) {
                    table[i][j] = list.get(k);
                    k++;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Your list for table is empty or deficiency full");

        }
    }

    @Override
    public Object getCell(int i, int j) {
        try {
            return table[i][j];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You try to get element which does not exist!");
            throw new IndexOutOfBoundsException("You try to get element which does not exist!");
        }

    }

    @Override
    public void printRow(String[] array) {
        for (String s : array) {
            System.out.printf("%-14.15s",s);
            System.out.print("\t");
        }
        System.out.println();

    }

    @Override
    public void printTable() {
        for (String[] row : table) {
            printRow(row);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return Arrays.deepToString(table);
    }
}
