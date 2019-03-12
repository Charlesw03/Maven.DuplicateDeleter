package com.zipcodewilmington.looplabs;

import java.util.Arrays;


public class Mylist {
    Object[] objArr;


    public Mylist(Object[] objArr) {
        this.objArr = objArr;
    }

    public Object[] toArray() {
        return objArr;
    }

    public Integer getNumberOfOccurences(Object input) {
        Integer counta = 0;
        for (Object obj : objArr) {
            if (obj.equals(input)) {
                counta++;
            }
        }
        return counta;
    }

    public void remove(int input) {
        Object valueToRemove = objArr[input];
        for (int i = 0; i < objArr.length; i++) {
            objArr[i ] = objArr[i];
        }
        objArr[objArr.length - 1] = valueToRemove;
        objArr = Arrays.copyOf(objArr, objArr.length - 1);

    }


    public void removeEverything(Object input) {
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i].equals(input)) {
                remove(i);
                i--;
            }
        }

    }


}
