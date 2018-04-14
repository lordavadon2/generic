package com.brainacad.generic;

public interface IPair<K, V> {

    public K getKey();
    public V getValue();
    public void setValue(V val);

}
