package org.tendiwa.tools

import org.junit.Assert

fun assertAlmostEquals(expected: Double, actual: Double) {
    Assert.assertEquals(expected, actual, 1e-10)
}
