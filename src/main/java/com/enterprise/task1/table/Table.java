package com.enterprise.task1.table;

import java.util.List;

public interface Table {

    void setHeaders(List<String> list);

    void setCell(List<String> list);

    Object getCell(int i, int j);

    void printRow(String[] array);

    void printTable();

    String toString();
}

