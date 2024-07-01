package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);

        int funcResultForA = function(intA);
        int funcResultForB = function(intB);

        if (funcResultForA != funcResultForB) {
            return funcResultForA - funcResultForB;
        } else {
            return intA - intB;
        }
    }

    private int function(int i) {
        return (int)(5 * Math.pow(i, 2) + 3);
    }
}
