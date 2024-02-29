package kg.kursanov;

public class Card {

    private String firstName;
    private String lastName;

    private Long cardNumber;

    private double balance;

    private int keyCode;


    public Card(String firstName, String lastName, Long cardNumber, double balance, int keyCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.keyCode = keyCode;
    }

    public Card() {
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

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }

    @Override
    public String toString() {
        return "Card{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cardNumber=" + cardNumber +
                ", balance=" + balance +
                ", keyCode=" + keyCode +
                '}';
    }
}
