package com.enterprise.task1;

import com.enterprise.task1.table.AsciiTable;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //case1 Operation with ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        CountForList list10000 = new CountForList(list, 10000);
        CountForList list100000 = new CountForList(list, 100000);
        CountForList list1000000 = new CountForList(list, 1000000);
        double resultListAdd = Util.totalCalculate(list10000.add(), list100000.add(), list1000000.add());
        double resultListGet = Util.totalCalculate(list10000.get(), list100000.get(), list1000000.get());
        double resultListRemove = Util.totalCalculate(list10000.remove(), list100000.remove(), list1000000.remove());
        double resultListContains = Util.totalCalculate(list10000.contain(), list100000.contain(), list1000000.contain());
        double resultListIterAdd = Util.totalCalculate(list10000.addIterator(), list100000.addIterator(), list1000000.addIterator());
        double resultListIterRem = Util.totalCalculate(list10000.removeIterator(), list100000.removeIterator(), list1000000.removeIterator());
        List<String> result = new ArrayList<>();
        result.add("ArrayList");
        result.add(String.valueOf(resultListAdd));
        result.add(String.valueOf(resultListGet));
        result.add(String.valueOf(resultListRemove));
        result.add(String.valueOf(resultListContains));
        result.add(String.valueOf(resultListIterAdd));
        result.add(String.valueOf(resultListIterRem));

        //case 2 Operation with LinkedList

        LinkedList<Integer> linkedList = new LinkedList<>();
        CountForList linkList10000 = new CountForList(linkedList, 10000);
        CountForList linkList100000 = new CountForList(linkedList, 100000);
        CountForList linkList1000000 = new CountForList(linkedList, 1000000);
        double resultLinkListAdd = Util.totalCalculate(linkList10000.add(), linkList100000.add(), linkList1000000.add());
        double resultLinkListGet = Util.totalCalculate(linkList10000.get(), linkList100000.get(), linkList1000000.get());
        double resultLinkListRemove = Util.totalCalculate(linkList10000.remove(), linkList100000.remove(), linkList1000000.remove());
        double resultLinkListContains = Util.totalCalculate(linkList10000.contain(), linkList100000.contain(), linkList1000000.contain());
        double resultLinkListIterAdd = Util.totalCalculate(linkList10000.addIterator(), linkList100000.addIterator(), linkList1000000.addIterator());
        double resultLinkListIterRem = Util.totalCalculate(linkList10000.removeIterator(), linkList100000.removeIterator(), linkList1000000.removeIterator());
        result.add("LinkedList");
        result.add(String.valueOf(resultLinkListAdd));
        result.add(String.valueOf(resultLinkListGet));
        result.add(String.valueOf(resultLinkListRemove));
        result.add(String.valueOf(resultLinkListContains));
        result.add(String.valueOf(resultLinkListIterAdd));
        result.add(String.valueOf(resultLinkListIterRem));


        //case 3 Operation with HashSet

        HashSet<Integer> hashSet = new HashSet<>();
        CountForSet hashSet10000 = new CountForSet(hashSet, 10000);
        CountForSet hashSet100000 = new CountForSet(hashSet, 100000);
        CountForSet hashSet1000000 = new CountForSet(hashSet, 1000000);
        double resultHashSetAdd = Util.totalCalculate(hashSet10000.add(), hashSet100000.add(), hashSet1000000.add());
        double resultHashSetRemove = Util.totalCalculate(hashSet10000.remove(), hashSet100000.remove(), hashSet1000000.remove());
        double resultHashSetContains = Util.totalCalculate(hashSet10000.contain(), hashSet100000.contain(), hashSet1000000.contain());
        result.add("HashSet");
        result.add(String.valueOf(resultHashSetAdd));
        result.add("-");
        result.add(String.valueOf(resultHashSetRemove));
        result.add(String.valueOf(resultHashSetContains));
        result.add("-");
        result.add("-");

        //case 4 Operation with TreeSet

        TreeSet<Integer> treeSet = new TreeSet<>();
        CountForSet treeSet10000 = new CountForSet(treeSet, 10000);
        CountForSet treeSet100000 = new CountForSet(treeSet, 100000);
        CountForSet treeSet1000000 = new CountForSet(treeSet, 1000000);
        double resultTreeSetAdd = Util.totalCalculate(treeSet10000.add(), treeSet100000.add(), treeSet1000000.add());
        double resultTreeSetRemove = Util.totalCalculate(treeSet10000.remove(), treeSet100000.remove(), treeSet1000000.remove());
        double resultTreeSetContains = Util.totalCalculate(treeSet10000.contain(), treeSet100000.contain(), treeSet1000000.contain());
        result.add("TreeSet");
        result.add(String.valueOf(resultTreeSetAdd));
        result.add("-");
        result.add(String.valueOf(resultTreeSetRemove));
        result.add(String.valueOf(resultTreeSetContains));
        result.add("-");
        result.add("-");


        //case 5 Table and output

        List<String> headLine = new ArrayList<>();
        headLine.add(" ");
        headLine.add("ADD");
        headLine.add("GET");
        headLine.add("REMOVE");
        headLine.add("CONTAINS");
        headLine.add("ITERATOR.ADD");
        headLine.add("ITERATOR.REMOVE");


        AsciiTable asciiTable = new AsciiTable(5, 7);
        asciiTable.setHeaders(headLine);
        asciiTable.setCell(result);
        asciiTable.printTable();
        File file = new File("Result");
        for (String s:result
             ) {
            headLine.add(s);
        }
        FileWritten.fileWrite(file,headLine);


    }
}
