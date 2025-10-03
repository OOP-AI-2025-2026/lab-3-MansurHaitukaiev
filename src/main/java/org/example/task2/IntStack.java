package org.example.task2;

public class IntStack {
    private int[] stackArray;
    private int size;

    private static final int CAPACITY = 20;

    public IntStack() {
        this.stackArray = new int[CAPACITY];
        this.size = 0;
    }

    public void push(int value) {
        growIfNeeded();
        this.stackArray[this.size] = value;
        this.size++;
    }

    public int pop() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пустий");
        }
        int value = this.stackArray[this.size - 1];
        this.size--;
        return value;
    }

    public int peek() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пустий");
        }
        return this.stackArray[this.size - 1];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.stackArray[i] = 0;
        }
        this.size = 0;
    }

    // метод для динамічного розширення.
    // приватний тому-що він нікому крім нас не потрібен.
    private void growIfNeeded() {
        if (this.size >= this.stackArray.length) {
            int newCapacity = this.stackArray.length * 2; // подвоєння розміру
            int[] newStackArray = new int[newCapacity];

            for (int i = 0; i < this.size; i++) {
                newStackArray[i] = this.stackArray[i];
            }
            this.stackArray = newStackArray;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cтек: [");
        for (int i = 0; i < this.size; i++) {
            sb.append(stackArray[i]);
            if (i < this.size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
