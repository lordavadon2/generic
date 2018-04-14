package com.brainacad.generic;

public class Holder<T> {

    private T value;

    public Holder(){

    }

//    public T2 getValue() {
//        return (T2)value;
//    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
