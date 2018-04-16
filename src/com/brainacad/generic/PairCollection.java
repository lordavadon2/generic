package com.brainacad.generic;

public class PairCollection<K extends Number & Comparable, V> {
    public Object [] array;
    private int pointer;

    public PairCollection(Object[] array) {
        this.array = array;
        pointer = array.length;
    }

    public Object[] getAllItems(){
        return array;
    }

    public V getValue(K key){
       for (Object holder : array){
           if (((Pair< K, V>) holder).getKey() == key) {
               return ((Pair<K, V>) holder).getValue();
           }
       }
       return null;
    }

    public int caseCount(K key){
        int result = 0;
        for (Object o: this.array) {
            if (((Pair<K, V>)o).getKey() ==key){
                result++;
            }
        }
        return result;
    }

    public int addItem(Pair<K, V> pair){
        if(pointer == array.length)
            resize(array.length+1);
        array[pointer++] = pair;
        return pointer;
    }

    public int removeItem(K key){
        for (int i = 0; i < pointer;){
            if (((Pair<K, V>)array[i]).getKey() == key){
                for (int j = i; j < pointer-1; j++) {
                    array[j] = array[j + 1];
                }
                pointer--;
                resize(array.length-1);
                continue;
            }
            i++;
        }
        return 1;
    }


    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

}
