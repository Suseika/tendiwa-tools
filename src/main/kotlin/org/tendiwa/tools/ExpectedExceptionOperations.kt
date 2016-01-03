package org.tendiwa.tools

import org.junit.rules.ExpectedException

fun ExpectedException.expectIllegalArgument(message: String) {
    expectMessage(message)
    expect(IllegalArgumentException::class.java)
}
