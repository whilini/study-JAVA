package ch04;

import ch02.MyArray;

public class MyArrayStack {

    MyArray arrayStack;
    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
       return arrayStack.removeElement(--top);
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(top-1);
    }

    public boolean isFull() {
        return top == arrayStack.ARRAY_SIZE;
    }

    public boolean isEmpty() {
        if(top == 0) {
            System.out.println("stack is empty");
            return true;
        } else {
            return false;
        }
    }

    public void printAll() {
        arrayStack.printAll();
    }

}
