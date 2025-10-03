package org.example.task2;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart(10);

        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.add(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.add(new Item(5, "Samsung RB34 Холодильник", 22399));
        cart.add(new Item(6, "De'Longhi Magnifica S Кавоварка", 10599));
        cart.add(new Item(7, "Gorenje Електрична плита", 9999));
        cart.add(new Item(8, "Dyson V11 Пилосос", 16499));
        cart.add(new Item(9, "Samsung ME83K Мікрохвильова піч", 3199));
        cart.add(new Item(10, "Philips DryCare Фен", 1499));

        System.out.println(cart);

        cart.remove(9);
        System.out.println("After removing item with id 9: ");
        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);

        // Завдання 1

        System.out.println("\n\n\nЗавдання 1 з класом Box\n");

        try {
            Box box = new Box(9, 2, 7);

            System.out.println("Довжина: " + box.getLength());
            System.out.println("Ширина: " + box.getWidth());
            System.out.println("Висота: " + box.getHeight());

            System.out.println("\nПлоща поверхні: " + box.surfaceArea());
            System.out.println("Площа бічної поверхні: " + box.lateralSurfaceArea());
            System.out.println("Об'єм: " + box.volume());
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        // Завдання 3

        System.out.println("\n\n\nЗавдання 3 з класом IntStack\n");

        IntStack stack = new IntStack();

        stack.push(1);
        stack.push(9);
        stack.push(2);
        stack.push(8);
        stack.push(3);
        stack.push(7);
        stack.push(4);
        stack.push(6);
        stack.push(5);

        System.out.println(stack);
        System.out.println("Витягнутий елемент: " + stack.pop());
        System.out.println(stack);

        System.out.println("\nЕлемент на вершині стеку: " + stack.peek());
        System.out.println("Витягнутий елемент: " + stack.pop());
        System.out.println(stack);
        System.out.println("Елемент на вершині стеку: " + stack.peek());

        System.out.println("\nКількість елементів: " + stack.size());
        System.out.println("Витягнутий елемент: " + stack.pop());
        System.out.println(stack);
        System.out.println("Кількість елементів: " + stack.size());

        System.out.println("\nЧи порожній стек?: " + stack.isEmpty());
        stack.clear();
        System.out.println("Стек після очищення: " + stack);
        System.out.println("Чи порожній стек?: " + stack.isEmpty());
    }
}