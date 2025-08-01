package HW4_1;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        System.out.println("Общее число животных: " + Animal.getCountAnimals());
        System.out.println("Число собак: " + Dog.getCountDogs());
        System.out.println("Число котов: " + Cat.getCountCats());

        dog1.run(400);
        dog1.run(600);

        dog1.swim(8);
        dog1.swim(15);

        Miska miska = new Miska(10);

        Cat[] cats = {cat1, cat2};

        for (Cat c : cats) {
            c.eat(miska, 15);
            System.out.println(c.name + " сытость: " + c.isSated());
            System.out.println("Остаток еды в миске: " + miska.getFood());
            System.out.println();

            c.eat(miska, 5);
            System.out.println(c.name + " сытость: " + c.isSated());
            System.out.println("Остаток еды в миске: " + miska.getFood());
            System.out.println();

            miska.addFood(20);

            c.eat(miska, 20);
            System.out.println(c.name + " сытость: " + c.isSated());
            System.out.println("Остаток еды в миске: " + miska.getFood());
            System.out.println();

        }
        System.out.println("Общее число животных: " + Animal.getCountAnimals());
        System.out.println("Число собак: " + Dog.getCountDogs());
        System.out.println("Число котов: " + Cat.getCountCats());

    }
}
