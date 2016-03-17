package org.tendiwa.tools

import java.lang.reflect.Method

val Class<*>.inheritedMethods: List<Method>
    get() =
    declaredMethods.asList() + interfaces.flatMap { it.inheritedMethods }
