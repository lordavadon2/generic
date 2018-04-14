package com.brainacad.generic;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Pair<Integer, String> test = new Pair<>(1, "one");
        Pair<Integer, String> test2 = new Pair<>(2, "two");
        Pair<Integer, String> test3 = new Pair<>(3, "three");
        Pair<Integer, String> test4 = new Pair<>(1, "one");
        Pair<Integer, String> test5 = new Pair<>(5, "f4");


        Object[] arr = new Object[]{test3, test4, test, test2};
        PairCollection<Integer, String> collection = new PairCollection<>(arr);

        collection.addItem(test5);
        collection.addItem(test2);
        collection.addItem(test);
        collection.removeItem(1);

        System.out.println(collection.caseCount(1));

        Object[] arrayPair = collection.getAllItems();

        Arrays.sort(arrayPair);

        for(Object pair: arrayPair){
            System.out.println( ((Pair<Integer, String>)pair).toString());
        }





    }
}