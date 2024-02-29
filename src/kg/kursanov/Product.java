package kg.kursanov;

import java.time.LocalDate;

public class Product {

    private String productName;

    private double price;

    private LocalDate dataOfPreparation;

    private LocalDate dueDateOfProducts;

    public Product(String productName, double price,LocalDate dataOfPreparation,LocalDate dueDateOfProducts ) {
        this.productName = productName;
        this.price = price;
        this.dataOfPreparation = dataOfPreparation;
        this.dueDateOfProducts = dueDateOfProducts;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDataOfPreparation() {
        return dataOfPreparation;
    }

    public void setDataOfPreparation(LocalDate dataOfPreparation) {
        this.dataOfPreparation = dataOfPreparation;
    }

    public LocalDate getDueDateOfProducts() {
        return dueDateOfProducts;
    }

    public void setDueDateOfProducts(LocalDate dueDateOfProducts) {
        this.dueDateOfProducts = dueDateOfProducts;
    }

    public void checkingTheExpirationDate(){
        LocalDate currentDate = LocalDate.now();
        if (dueDateOfProducts.isBefore(currentDate)){
            price *= 0.5;
            System.out.println(productName +" |  " + dueDateOfProducts + "чейин болчу " + " | " + price +"cом" +  " -    продуктанын мооноту откон болгондуктан 50% арзандатуу!");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", dataOfPreparation=" + dataOfPreparation +
                ", dueDateOfProducts=" + dueDateOfProducts +
                '}';
    }
}
