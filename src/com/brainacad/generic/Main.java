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

//        System.out.println(test.getKey());
//        System.out.println(test.getValue());
        Object[] arr = new Object[]{test3, test4, test, test2};
        PairCollection<Integer, String> collection = new PairCollection<>(arr);

        Object[] arrayPair = collection.getAllItems();

        Arrays.sort(arrayPair);

        for(Object pair: arrayPair){
            System.out.println( ((Pair<Integer, String>)pair).toString());
        }

        collection.addItem(test5);
        collection.addItem(test2);
        collection.addItem(test);
        collection.removeItem(1);

        System.out.println(collection.caseCount(1));
//        System.out.println(collection.addItemCollection(3, "dfgd"));


//        System.out.println(collection.getValue(1));
//        System.out.println(collection.getValue(2));

    }
}


////        Holder<Integer> h1 = new Holder<Integer>();
//        Holder<String> h1 = new Holder<String>();
////        h1.setValue(1);
////        h1.setValue("sdvsdsd");
//        h1.setValue("1");
////        h1.setValue((Integer)h1.getValue() + 1);
//        h1.setValue(h1.getValue() + 1);
//        System.out.println(h1.getValue());

//        Pair<Integer, String> test = new Pair<>(1, "one");
//        Pair<Integer, String> test2 = new Pair<>(2, "two");
//        System.out.println(test.getKey());
//        System.out.println(test.getValue());
//        Object[] arr = new Object[]{test, test2};
//        PairCollection<Integer, String> collection = new PairCollection<>(arr);
//
//        System.out.println(collection.getValue(1));
//        System.out.println(collection.getValue(2));

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.remove(2);