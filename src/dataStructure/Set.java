package dataStructure;

import java.util.ArrayList;

public class Set {
    private int count;
    private boolean isEmpty = false;
    private String[] element = new String[4];


    List elements = new Vector();


    public void add(String item) {
        elements.add(item);

    }

    public int size() {
        return elements.size();
    }

    public void clear() {
        for (int i = 0; i < element.length; i++) {
            element[i] = null;
            isEmpty = true;
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void remove(int id) {
        element[id]= null;
        count --;


    }

    public String get(int id) {
        return element[id];
    }
}
