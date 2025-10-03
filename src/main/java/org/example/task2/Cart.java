package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int index;

    public Cart(int capacity) {
        this.contents = new Item[capacity];
        this.index = 0;
    }

    public void add(Item item) {
        if (isCartFull()) {
            System.out.println("Cart is full. Cannot add item: " + item.getName());
            return;
        }

        this.contents[this.index] = item;
        this.index++;
    }

    public void remove(long itemId) {
        if (this.index == 0) {
            return;
        }

        int foundItemIndex = findItemInArray(itemId);
        if (foundItemIndex == -1) {
            return;
        }
        shiftArray(foundItemIndex);
    }

    private void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < this.index - 1; i++) {
            this.contents[i] = this.contents[i + 1];
        }
        this.contents[this.index-1] = null;
        this.index--;
    }

    private int findItemInArray(long id) {
        for (int i = 0; i < this.index; i++) {
            if (this.contents[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public boolean isCartFull() {
        return this.index == this.contents.length;
    }

    public Item[] getItems() {
        return Arrays.copyOf(this.contents, this.index);
    }

    public double getTotalPrice() {
        double sum = 0.0;
        for (int i = 0; i < this.index; i++) {
            sum += this.contents[i].getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(contents) +
                '}' + "\n";
    }
}