package org.example.task2;

public class Item {

    private long id;
    private String name;
    private double price;

    public Item(long id, String name, double price) {
        setId(id);
        setName(name);
        setPrice(price);
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    private void setName(String name) throws IllegalArgumentException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Item name must not be empty");
        }
        this.name = name;
    }

    private void setId(long id) throws IllegalArgumentException {
        if (id <= 0) {
            throw new IllegalArgumentException("Item id must be positive");
        }
        this.id = id;
    }

    private void setPrice(double price) throws IllegalArgumentException {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + this.id +
                ", price=" + this.price +
                ", name='" + this.name + '\'' +
                '}' + "\n";
    }
}
