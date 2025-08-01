package HW4_1;

public class Cat extends Animal {
    private static int countCats = 0;
    private boolean isSated; // сытость
    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 0;

    public Cat(String name) {
        super(name);
        countCats++;
        this.isSated = false; // изначально голоден
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать так далеко.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }

    public void eat(Miska miska, int foodAmount) {
        if (foodAmount <= 0) {
            System.out.println("Некорректное количество еды для кормления.");
            return;
        }
        if (miska.getFood() >= foodAmount && foodAmount > 0) {
            miska.decreaseFood(foodAmount);
            this.isSated = true;
            System.out.println(name + " покушал(а) и стал(а) сытым(ой).");
        } else {
            System.out.println("В миске недостаточно еды для " + name);
        }
    }

    public boolean isSated() {
        return isSated;
    }

    public static int getCountCats() { return countCats; }
}
