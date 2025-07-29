package HW3;

public class Park {
    String namePark;
    public Park(String namePark){
        this.namePark = namePark;
    }

    public class Attraction {
        String openingHours;
        int price;
        public Attraction(String openingHours, int price){
            this.openingHours = openingHours;
            this.price = price;
        }
        Park.Attraction attraction1 = new Park("Disney World").new Attraction("12PM-2AM", 255);
    }

}
