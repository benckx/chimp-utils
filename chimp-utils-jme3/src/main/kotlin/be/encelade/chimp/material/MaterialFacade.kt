package be.encelade.chimp.material

import be.encelade.chimp.gameplay.Color
import be.encelade.chimp.utils.ColorHelperUtils.ColorRGBA
import be.encelade.chimp.utils.ColorHelperUtils.toColorRGBA
import com.jme3.material.Material
import com.jme3.material.MaterialDef
import com.jme3.material.RenderState
import com.jme3.math.ColorRGBA

abstract class MaterialFacade(def: MaterialDef) : Material(def) {

    abstract fun setColor(colorRGBA: ColorRGBA)

    fun setColor(color: Color) {
        setColor(color.toColorRGBA())
    }

    fun setColor(color: java.awt.Color) {
        setColor(ColorRGBA(color))
    }

    fun setColor(hex: String) {
        setColor(ColorRGBA(hex))
    }

    fun makeTransparent() {
        additionalRenderState.blendMode = RenderState.BlendMode.Alpha
    }
}
