package be.encelade.chimp.utils

import be.encelade.chimp.gameplay.Color
import com.jme3.math.ColorRGBA
import kotlin.math.max
import kotlin.math.min

import java.awt.Color as AwtColor

object ColorHelperUtils {

    fun ColorRGBA(r: Int, g: Int, b: Int, a: Int = 1): ColorRGBA {
        return ColorRGBA(r / 255f, g / 255f, b / 255f, a / 255f)
    }

    fun ColorRGBA(hex: String): ColorRGBA {
        return ColorRGBA(AwtColor.decode(hex))
    }

    fun ColorRGBA(color: AwtColor): ColorRGBA {
        return ColorRGBA(color.red, color.green, color.blue, color.alpha)
    }

    fun ColorRGBA(greyLevel: Int, a: Int = 1): ColorRGBA {
        return ColorRGBA(greyLevel, greyLevel, greyLevel, a)
    }

    fun ColorRGBA.darker(value: Int): ColorRGBA {
        val f = value / 255f
        return ColorRGBA(max(0f, this.r - f), max(0f, this.g - f), max(0f, this.b - f), this.a)
    }

    fun ColorRGBA.lighter(value: Int): ColorRGBA {
        val f = value / 255f
        return ColorRGBA(min(1f, this.r + f), min(1f, this.g + f), min(1f, this.b + f), this.a)
    }

    fun ColorRGBA.withAlpha(a: Int): ColorRGBA {
        return ColorRGBA(this.r, this.g, this.b, a / 255f)
    }

    fun Color.toColorRGBA(): ColorRGBA {
        return ColorRGBA(r, g, b, a)
    }

}
