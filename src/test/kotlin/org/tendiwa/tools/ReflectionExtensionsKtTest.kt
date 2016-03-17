package org.tendiwa.tools

import org.junit.Test
import kotlin.test.assertEquals

class ReflectionExtensionsKtTest {
    @Test
    fun `finds own and inherited methods`() {
        assertEquals(
            setOf("height", "name", "id"),
            Person().javaClass
                .declaredMethods
                .map { it.name }
                .toSet()
        )
    }

    class Person() : Nameable {
        fun height(): Int = 20
    }

    interface Nameable : Identifiable {
        fun name(): String = "hello"
    }

    interface Identifiable {
        fun id(): Int = 13
    }
}

