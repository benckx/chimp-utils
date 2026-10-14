package be.encelade.chimp.material

import com.jme3.asset.DesktopAssetManager
import com.jme3.math.ColorRGBA
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class LightingMaterialTest {
    @Test
    fun setColorsSetsDiffuseAndSpecularAsDocumented() {
        MaterialDefinitions.load(DesktopAssetManager(true))
        val material = LightingMaterial()
        material.setColors(ColorRGBA.Orange, ColorRGBA.White)
        assertEquals(ColorRGBA.Orange, material.getParam("Diffuse").value)
        assertNotNull(material.getParam("Specular"))
        assertEquals(ColorRGBA.White, material.getParam("Specular").value)
        assertEquals(true, material.getParam("UseMaterialColors").value)
    }
}
