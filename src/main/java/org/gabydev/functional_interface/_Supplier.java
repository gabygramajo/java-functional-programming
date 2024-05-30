package org.gabydev.functional_interface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println("Normal function: " + getDBConnectionURL());
        System.out.println("Supplier function interface: " + getDBConnectionURLSupplier.get());
    }

    static String getDBConnectionURL () {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionURLSupplier = () -> "jdbc://localhost:5432/users";
}
