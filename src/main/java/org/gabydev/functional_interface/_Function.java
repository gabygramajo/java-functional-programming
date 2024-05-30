package org.gabydev.functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        // Function takes 1 argument and produces 1 result
        int increment = increment(1);
        System.out.println("normal increment: " + increment);

        Integer increment2 = incrementByOneFunction.apply(2);
        System.out.println("functional increment: " + increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println("multiply = " + multiply);

        Function<Integer, Integer> addBy1AndMultiplyBy10 =
                incrementByOneFunction
                        .andThen(multiplyBy10Function);

        int incrementeAndMultiply = addBy1AndMultiplyBy10.apply(1);
        System.out.println("incrementeAndMultiply = " + incrementeAndMultiply);

        // Function takes 2 argument and produces 1 result
        System.out.println("normal function: " + incrementByOneAndMultiply(4, 100));
        System.out.println("Bi function: " + incrementByOneAndMultiplyBiFunction.apply(4, 100));

    }

    static Function<Integer, Integer> multiplyBy10Function = number -> number*10;

    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static int increment(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrement, numberToMultiply)
                    -> (numberToIncrement + 1) * numberToMultiply;

    static int incrementByOneAndMultiply(int number, int numToMultiPlyBy ) {
        return (number + 1) * numToMultiPlyBy;
    }
}
