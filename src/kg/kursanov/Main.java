package kg.kursanov;


import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Card masterCard = new Card("ZARIPBEK","KURSANOV",1111111111111111L,5000,3412);

        Product product1 = new Product("Kitep",300, LocalDate.of(2024,3,12),LocalDate.of(2026,2,12));
        Product product2 = new Product("Bumaga",70, LocalDate.of(2024,1,12),LocalDate.of(2026,2,12));
        Product product3 = new Product("Ruchka",40, LocalDate.of(2024,1,12),LocalDate.of(2026,2,12));
        Product product4 = new Product("Chai",120, LocalDate.of(2024,1,12),LocalDate.of(2026,2,12));
        Product product5 = new Product("Sahar",65, LocalDate.of(2024,1,12),LocalDate.of(2023,12,12));
        Product product6 = new Product("Kese",100, LocalDate.of(2024,1,12),LocalDate.of(2026,2,12));
        Product product7 = new Product("Cola",120, LocalDate.of(2024,1,12),LocalDate.of(2023,2,12));
        Product product8 = new Product("Sultan chai",50, LocalDate.of(2024,1,12),LocalDate.of(2023,2,12));

        Product[] productses = {product8,product3};



        Product[] products = {product1,product2,product3,product4,product5,product6,product7,product8};
        Basket basket = new Basket(products);// Эгер 100 сомдон аз суммага покупка кылып коргунуз келсе анда бардык for лордогу products тарды productses ке айлантыныз!

        Client client = new Client("Zaripbek","Kursanov",22,masterCard,basket);


        double countPrice = 0;
        for (Product product : products) {
            countPrice += product.getPrice();
        }

        if (client.getCard().getBalance() > countPrice){
            if (countPrice < 100) {
                for (Product product : products) {
                    product.checkingTheExpirationDate();

                }
                client.payWithCard(masterCard.getBalance());
                client.getCardBalance();
            } else if (countPrice > 100){
                System.out.println("Сыр созду жазыныз: ****");
                int cod = new Scanner(System.in).nextInt();
                if (masterCard.getKeyCode() == cod) {
                    for (Product product : products) {
                        product.checkingTheExpirationDate();
                    }
                    client.payWithCard(masterCard.getBalance());
                    client.getCardBalance();
                } else {
                    System.out.println("Cыр соз туура эмес!");
                }
            }
        } else if (!(client.getCard().getBalance() > countPrice)) {
            System.out.println("Каражатыныз жетишсиз!");

        }
    }
}