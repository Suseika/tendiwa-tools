package org.tendiwa.tools

/**
 * Throws [IllegalArgumentException] if [argument] doesn't satisfy [predicate].
 * @param argument Any value.
 * @param predicate Predicate.
 * @param message Producer of a message for exception.
 * @throws IllegalArgumentException if `predicate(argument) == false`.
 */
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

/**
 * Throws [IllegalArgumentException] if condition is not satisfied.
 * @param valid Result of some condition.
 * @param message Producer of a message for exception.
 * @throws IllegalArgumentException if [valid] is false.
 */
inline fun validateArguments(
    valid: Boolean,
    message: () -> String
) {
    if (!valid) {
        throw IllegalArgumentException(message())
    }
}
