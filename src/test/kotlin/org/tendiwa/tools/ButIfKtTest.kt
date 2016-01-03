package org.tendiwa.tools

import org.junit.Test
import kotlin.test.assertEquals

class ButIfKtTest {
    @Test
    fun producesNewValueIfPredicateIsSatisfied() {
        assertEquals(2.0, 3.0.butIf({ it > 2.0 }, { 2.0 }))
    }

    @Test
    fun retainsValueIfPredicateIsNotSatisfied() {
        assertEquals("hello", "hello".butIf({ it == "goodbye" }, { "GOODBYE" }))
    }
}
