package be.encelade.chimp.material

import be.encelade.chimp.material.MaterialDefinitions.lightingDef
import com.jme3.math.ColorRGBA
import com.jme3.texture.Texture

class LightingMaterial : MaterialFacade(lightingDef) {

    override fun setColor(colorRGBA: ColorRGBA) {
        setDiffuse(colorRGBA)
        setAmbient(colorRGBA)
        useMaterialColors(true)
    }

    fun setDiffuse(colorRGBA: ColorRGBA) {
        setColor("Diffuse", colorRGBA)
    }

    fun setAmbient(colorRGBA: ColorRGBA) {
        setColor("Ambient", colorRGBA)
    }

    fun setTexture(texture: Texture) {
        setTexture("DiffuseMap", texture)
        useMaterialColors(false)
    }

    fun useMaterialColors(value: Boolean) {
        setBoolean("UseMaterialColors", value)
    }
}
