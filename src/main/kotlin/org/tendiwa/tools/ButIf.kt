package org.tendiwa.tools

fun <T, R : T> T.butIf(
    predicate: (T) -> Boolean,
    producer: (T) -> R
): T =
    if (predicate(this)) producer(this) else this


