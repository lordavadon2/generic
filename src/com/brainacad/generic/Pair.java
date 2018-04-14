package com.brainacad.generic;

public class Pair<K extends Number & Comparable, V> implements IPair<K, V>, Comparable {

    K key;
    V val;

    public Pair(K key, V val) {
        this.key = key;
        this.val = val;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return val;
    }

    @Override
    public void setValue(V val) {
        this.val = val;
    }

    @Override
    public int compareTo(Object o) {
        return this.getKey().compareTo(((Pair<K, V>)o).getKey());
    }

    @Override
    public String toString() {
        return this.getKey() + " " + this.getValue();
    }

}
