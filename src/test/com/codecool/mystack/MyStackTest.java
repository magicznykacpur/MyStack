package com.codecool.mystack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    MyStack myStack;

    @BeforeEach
    void initializeNeccessaryData() {
        myStack = new MyStack(10);
    }

    @Test
    void myStackConstructorTest() {
        assertNotNull(myStack);
    }

    @Test
    void parametrizedMyStackConstructorTest() {
        assertEquals(10, myStack.getMaxSize());
    }

    @Test
    void myStackPushTest() {
        fillStack(3, "testValue");

        assertEquals("testValue", myStack.peak(0));
        assertEquals("testValue", myStack.peak(1));
        assertEquals("testValue", myStack.peak(2));
    }

    @Test
    void myStackPopThrowsNullPointerTest() {
        assertThrows(NullPointerException.class, () ->
                myStack.pop(), "Pop doesn't throw NullPointerException when stack is empty");
    }

    @Test
    void myStackPopTest() {
        fillStack(3, "testValue");

        assertEquals("testValue", myStack.peak(2));

        myStack.pop();

        assertNull(myStack.peak(2));
    }

    @Test
    void myStackPeakTest() {
        myStack.push("Test value");
        assertNotNull(myStack.peak(0));
    }

    @Test
    void myStackIsEmptyTest() {
        assertTrue(myStack.isEmpty());
    }

    private void fillStack(int count, String value) {
        for (int i = 0; i < count; i++) {
            myStack.push(value);
        }
    }
}