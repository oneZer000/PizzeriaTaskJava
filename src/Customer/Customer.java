package Customer;

import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
    private static final AtomicInteger counter = new AtomicInteger(1);

    private String name;
    private String phoneNumber;
    private int number;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.number = counter.getAndIncrement();
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumber() {
        return number;
    }
}
