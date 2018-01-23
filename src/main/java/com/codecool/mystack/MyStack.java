package com.codecool.mystack;

public class MyStack<T> {

    private int maxSize;
    private int current;
    private T[] data;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.current = -1;
        this.data = (T[]) new Object[maxSize];
    }

    public Object peak() {
        Object curr;

        if (current == -1)
            curr = null;
        else
            curr = data[current];

        return curr;
    }

    public void push(T newData) {
        data[++current] = newData;
    }

    public void pop() {
        if (isEmpty())
            throw new NullPointerException("Stack already empty, cannot pop.");
        else {
            data[current--] = null;
        }
    }

    public int getMaxSize() {
        return maxSize;
    }

    public boolean isEmpty() {
        return data[0] == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Object o : data)
            sb.append(" " + o);

        return sb.toString();
    }
}
