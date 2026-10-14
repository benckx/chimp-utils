package be.encelade.chimp.utils

import be.encelade.chimp.utils.ColorHelperUtils.ColorRGBA
import org.junit.Assert.assertEquals
import org.junit.Test

class ColorHelperUtilsTest {
    @Test
    fun defaultRgbAndGrayscaleColorsAreOpaque() {
        assertEquals(1f, ColorRGBA(155, 164, 193).a, 0f)
        assertEquals(1f, ColorRGBA(128).a, 0f)
    }

    @Test
    fun explicitAlphaStillUsesByteRange() {
        assertEquals(0f, ColorRGBA(155, 164, 193, 0).a, 0f)
        assertEquals(128f / 255f, ColorRGBA(128, 128).a, 0f)
    }
}
