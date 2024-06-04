package org.gabydev.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // ofNullable: Devuelve un Opcional que describe el valor dado, si no es nulo; en caso contrario, devuelve un Opcional vacío.

        // orElseGet: Si un valor está presente, devuelve el valor; de lo contrario, devuelve el resultado producido por la función Supplier.
        Object example1 = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        System.out.println("example1 = " + example1);

        // orElseThrow: Si un valor está presente, devuelve el valor; de lo contrario, genera una excepción producida por la función (Supplier) que proporciona la excepción.
        Object example2 = Optional.ofNullable("No exception")
                .orElseThrow(() -> new IllegalStateException("exception"));
        System.out.println("example1 = " + example2);

        // ifPresent: Si un valor está presente, realiza la acción dada con el valor; de lo contrario, no hace nada.
        Optional.ofNullable("john@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to " + email));

        // ifPresentOrElse:
        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email"));
    }
}
