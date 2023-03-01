package Concurrency;

import java.util.concurrent.Executors;

class Food {
}

class Water {
}

public record DeadLock(String name) {
    public void eatAndDrink(Food food, Water water) {
        synchronized (food) {
            System.out.println(name() + " Got Food!");
            move();
            synchronized (water) {
                System.out.println(name() + " Got Water!");
            }
        }
    }

    public void drinkAndEat(Food food, Water water) {
        synchronized (water) {
            System.out.println(name() + " Got Water!");
            move();
            synchronized (food) {
                System.out.println(name() + " Got Food!");
            }
        }
    }

    public void move() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        // Create participants and resources
        var foxy = new DeadLock("Foxy");
        var tails = new DeadLock("Tails");
        var food = new Food();
        var water = new Water();
        // Process data
        var service = Executors.newScheduledThreadPool(10);
        try {
            service.submit(() -> foxy.eatAndDrink(food, water));
            service.submit(() -> tails.drinkAndEat(food, water));
        } finally {
            service.shutdown();
        }
    }
}