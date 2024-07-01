package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        if (sourceList.size() < 3) {
            return new ArrayList<>();
        }

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 2; i < sourceList.size(); i+=3) {
            String s = sourceList.get(i);
            strings.add(s);
            strings.add(s);
        }

        return strings;
    }
}
