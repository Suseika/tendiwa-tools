package org.tendiwa.tools

import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException

class ValidationKtTest {

    @JvmField @Rule val expectRule = ExpectedException.none()

    @Test
    fun validationCanPass() {
        validateArgument(
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
        validateArgument(
            "goodbye",
            { !it.startsWith("g") },
            { "Argument can't start with g" }
        )
    }
}
