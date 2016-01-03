package org.tendiwa.tools

fun <T, R : T> T.butIf(
    predicate: (T) -> Boolean,
    producer: () -> R
): T =
    if (predicate(this)) producer() else this


