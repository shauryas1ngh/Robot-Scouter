package com.supercilex.robotscouter.util;

/**
 * Precondition checking utility methods.
 */
public final class Preconditions {
    /**
     * Ensures that the provided value is not null, and throws a {@link NullPointerException}
     * if it is null, with a message constructed from the provided error template and arguments.
     */
    public static <T> T checkNotNull(
            T val,
            String errorMessageTemplate,
            Object... errorMessageArgs) {
        if (val == null) {
            throw new NullPointerException(String.format(errorMessageTemplate, errorMessageArgs));
        }
        return val;
    }
}
