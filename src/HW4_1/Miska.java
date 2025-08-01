package HW4_1;

public class Miska {
    private int food;

    public Miska(int initialFood) {
        if (initialFood < 0)
            this.food = 0;
        else
            this.food = initialFood;
    }

    public void addFood(int amount) {
        if (amount > 0)
            this.food += amount;
        else
            System.out.println("Некорректное количество добавляемой еды");
    }

    public int getFood() { return food; }

    public void decreaseFood(int amount) {
        if (amount > 0 && amount <= food)
            this.food -= amount;
        else
            System.out.println("Недостаточно еды в миске или некорректное значение");

        if (food < 0)
            food = 0;
    }
}
