package be.encelade.chimp.gameplay

import java.awt.Color as AwtColor

/**
 * Standalone color, that does not depend on any lib.
 */
data class Color(val r: Int, val g: Int, val b: Int, val a: Int = 255) {

    constructor(color: AwtColor) : this(color.red, color.green, color.blue, color.alpha)

    constructor(hex: String) : this(AwtColor.decode(hex))

}
