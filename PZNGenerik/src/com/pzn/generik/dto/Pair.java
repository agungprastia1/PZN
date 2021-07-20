package com.pzn.generik.dto;

/*
    membuat generik class 2 parameter
 */
public class Pair <T,U> {
    private T first;
    private U last;

    public Pair(T first, U last){
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getLast() {
        return last;
    }

    public void setLast(U last) {
        this.last = last;
    }
}
