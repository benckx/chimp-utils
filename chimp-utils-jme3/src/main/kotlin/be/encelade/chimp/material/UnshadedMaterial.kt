package be.encelade.chimp.material

import be.encelade.chimp.material.MaterialDefinitions.unshadedDef
import com.jme3.math.ColorRGBA

@Suppress("unused")
class UnshadedMaterial : MaterialFacade(unshadedDef) {

    override fun setColor(colorRGBA: ColorRGBA) {
        setColor("Color", colorRGBA)
    }

}
