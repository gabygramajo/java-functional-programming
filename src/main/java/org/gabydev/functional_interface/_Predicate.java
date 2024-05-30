package org.gabydev.functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("Without predicate");
        System.out.println("phoneNumber 1: " + isPhoneNumberValid("1144551111"));
        System.out.println("phoneNumber 2: " + isPhoneNumberValid("1144111"));
        System.out.println("phoneNumber 3: " + isPhoneNumberValid("8144551111"));

        //
        System.out.println("With predicate");
        System.out.println("phoneNumber 1: " +
                isPhoneNumberValidPredicate.test("1144551111"));

        System.out.println("phoneNumber 2: " +
                isPhoneNumberValidPredicate.test("1144111"));

        System.out.println("phoneNumber 3: " +
                isPhoneNumberValidPredicate.test("8144551111"));

        System.out.println(
                "Is valid number and contains number 3: " +
          isPhoneNumberValidPredicate.and(containsNumber3).test("1133551111")
        );
        System.out.println(
                "Is valid number and contains number 3: " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("1144551111")
        );

        System.out.println(
                "Is valid number and contains number 3: " +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("1133551111")
        );
        System.out.println(
                "Is valid number and contains number 3: " +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("1144551111")
        );

        System.out.println("BiPredicate");
        System.out.println("They are equal numbers: " + twoEqualNumbers.test(4,2));
        System.out.println("first number is greater: " + firstNumberIsGreater.test(4,2));
        System.out.println("They are equal numbers Or first number is greater: " +
                twoEqualNumbers.or(firstNumberIsGreater).test(4,2));

    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
        phoneNumber.startsWith("11") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    static BiPredicate<Integer, Integer> twoEqualNumbers = Integer::equals;

    static BiPredicate<Integer, Integer> firstNumberIsGreater = (number1, number2) ->
            number1 > number2;

    static boolean isPhoneNumberValid (String phoneNumber) {
         return phoneNumber.startsWith("11") && phoneNumber.length() == 10;
    }
}
