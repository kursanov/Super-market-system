package kg.kursanov;

import java.time.LocalDate;

public class Client implements CardInterface{

    private String firstName;
    private String lastName;
    private int age;
    private Card card;

    private Basket basket;

    public Client(String firstName, String lastName, int age, Card card, Basket basket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.card = card;
        this.basket = basket;
    }

    public Client() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", card=" + card +
                ", basket=" + basket +
                '}';
    }

    @Override
    public  void payWithCard(double money) {
        LocalDate currentDate = LocalDate.now();
        double oobshiySumma = 0;


            System.out.println("  Чек за покупка \n" + "" +
                    " __________________" +
                    "");

            for (Product product : basket.getProducts()) {
                if (product.getPrice() <= money) {
                    System.out.println("""
                            """ +
                            "|" + product.getProductName() + "|" + product.getPrice() + "|"
                            + currentDate + "|" + "\n"
                    );
                    oobshiySumma += product.getPrice();
                }
            }
            System.out.println("Итого " + oobshiySumma + " coм");


    }

    @Override
    public void getCardBalance() {
        double counter = 0;

        for (Product product : basket.getProducts()) {
            counter += product.getPrice();
        }
        double v = card.getBalance() - counter;
        System.out.println("Cиздин калган балансыныз| "  + v);


    }
}
