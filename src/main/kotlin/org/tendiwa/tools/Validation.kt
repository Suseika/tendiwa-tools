package org.tendiwa.tools

inline fun <T> validateArgument(
    argument: T,
    predicate: (T) -> Boolean,
    message: () -> String
) {
    if (!predicate(argument)) {
        throw IllegalArgumentException(
            message() + "; argument is \"$argument\""
        )
    }
}
