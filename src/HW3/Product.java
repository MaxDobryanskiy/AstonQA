package HW3;

public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String country;
    private int price;
    private boolean reservation;
    public Product(String name, String productionDate, String manufacturer, String country, int price, boolean reservation){
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.reservation = reservation;
            }
    public String toString() {
        return "Название: " + name + "\n" +
                "Дата производства: " + productionDate + "\n" +
                "Производитель: " + manufacturer + "\n" +
                "Страна: " + country + "\n" +
                "Цена: " + price + "\n" +
                "Бронирование: " + reservation;
    }
    public static void main(String[] args) {
        Product product1 = new Product("Чупа чупс","29.07.2025","ОАО Сосалити","Беларусь",255,true);
        System.out.println(product1);

        Product[]productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",

                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Samsung S24 Ultra", "01.02.2024",

                "Samsung Corp.", "Korea", 5566, true);
        productsArray[2] = new Product("Samsung S23 Ultra", "01.02.2023",

                "Samsung Corp.", "Korea", 5456, true);
        productsArray[3] = new Product("Samsung S22 Ultra", "01.02.2022",

                "Samsung Corp.", "Korea", 5789, true);
        productsArray[4] = new Product("Samsung S21 Ultra", "01.02.2021",

                "Samsung Corp.", "Korea", 5123, true);
    }

}
