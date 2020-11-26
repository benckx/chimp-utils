package be.encelade.chimp.material

import be.encelade.chimp.material.MaterialDefinitions.lightingDef
import com.jme3.math.ColorRGBA
import com.jme3.texture.Texture

class LightingMaterial : MaterialFacade(lightingDef) {

    override fun setColor(colorRGBA: ColorRGBA) {
        setColor("Diffuse", colorRGBA)
        setColor("Ambient", colorRGBA)
        setBoolean("UseMaterialColors", true)
    }

    fun setTexture(texture: Texture) {
        setTexture("DiffuseMap", texture)
        setBoolean("UseMaterialColors", false)
    }
}
