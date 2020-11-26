package be.encelade.chimp.utils

import com.jme3.scene.Node
import com.jme3.scene.Spatial

object NodeHelperUtils {

    fun Node.attachChildren(spatials: Collection<Spatial>): List<Int> {
        return spatials.map { attachChild(it) }
    }

    fun Node.attachChildren(vararg spatials: Spatial): List<Int> {
        return spatials.map { attachChild(it) }
    }

}
