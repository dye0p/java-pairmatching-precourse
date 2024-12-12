package pairmatching.model;

import java.util.Arrays;
import pairmatching.exception.ErrorMessage;

public enum Option {

    MATCHING("1"),
    READ("2"),
    INIT("3"),
    EXIT("Q");

    private final String value;

    Option(String value) {
        this.value = value;
    }

    public static Option of(String option) {
        return Arrays.stream(values())
                .filter(value -> value.value.equals(option))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage.INVALID_OPTION.getErrorMessage()));
    }
}
