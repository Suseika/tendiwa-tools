package org.tendiwa.tools

import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException

class ConstriantsKtTest {

    @JvmField @Rule val expectRule = ExpectedException.none()

    @Test
    fun validationCanPass() {
        argumentConstraint(
            "hello",
            { it != "goodbye" },
            { "There is no such thing as goodbye" }
        )
    }

    @Test
    fun validationCanFail() {
        expectRule.expectMessage(
            "Argument can't start with g; argument is \"goodbye\""
        )
        argumentConstraint(
            "goodbye",
            { !it.startsWith("g") },
            { "Argument can't start with g" }
        )
    }
}
