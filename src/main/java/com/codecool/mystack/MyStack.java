package com.codecool.mystack;

public class MyStack<T> {

    private int maxSize;
    private int top;
    private T[] data;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.top = 0;
        this.data = (T[]) new Object[maxSize];
    }

    public Object peak(int index) {
        return data[index];
    }

    public void push(T newData) {

        data[top++] = newData;
    }

    public void pop() {
        if (isEmpty())
            throw new NullPointerException("Stack already empty, cannot pop.");
        else {
            data[--top] = null;
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
