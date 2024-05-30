package org.gabydev.functional_interface;


import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer customer = new Customer("Maria", "999999");

        // normal function
        greetCustomer(customer);

        // Consumer Functional interface
        greetCustomerConsumer.accept(customer);

        // BiConsumer Functional interface
        greetCustomerBiConsumer.accept(customer, true);
        greetCustomerBiConsumer.accept(customer, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.name +
                    ", thanks for registering phone number "
                    + (showPhoneNumber
                    ? customer.phoneNumber
                    : "******")
            );

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.name +
                    ", thanks for registering phone number "
                    + customer.phoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name +
                ", thanks for registering phone number "
                + customer.phoneNumber);
    }

    static class Customer {
        private String name;
        private String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

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
    }
}
