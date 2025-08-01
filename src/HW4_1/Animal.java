package HW4_1;

public class Animal {
    protected static int countAnimals = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }

    public static int getCountAnimals() {
        return countAnimals;
    }
}

