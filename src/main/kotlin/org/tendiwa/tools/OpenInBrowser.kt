package org.tendiwa.tools

import java.io.File

fun File.openInBrowser() {
    Runtime.getRuntime().exec("x-www-browser $this")
}
