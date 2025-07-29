package HW3;

import java.util.ArrayList;

public class Park {
    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price);
            System.out.println();
        }
    }

    private ArrayList<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workingHours, double price) {
        attractions.add(new Attraction(name, workingHours, price));
    }

    public void showAllAttractions() {
        System.out.println("Информация об аттракционах парка:");
        for (Attraction attraction : attractions) {
            attraction.displayInfo();
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        Park park2 = new Park();
        Park park3 = new Park();

        park.addAttraction("Американские горки", "10:00 - 22:00", 500);
        park2.addAttraction("Карусель", "09:00 - 21:00", 200);
        park3.addAttraction("Лабиринт", "11:00 - 20:00", 150);

        park.showAllAttractions();
        park2.showAllAttractions();
        park3.showAllAttractions();
    }
}
