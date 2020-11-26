package be.encelade.chimp.node

import com.jme3.scene.Node
import com.jme3.scene.Spatial

object NodeHelperUtils {

    fun Node.attachChildren(spatials: Collection<Spatial>): List<Int> {
        return spatials.map { attachChild(it) }
    }

    fun Node.attachChildren(vararg spatials: Spatial): List<Int> {
        return spatials.map { attachChild(it) }
    }

    fun Node.attachChildren(vararg nodeBasedItems: NodeBased): List<Int> {
        return nodeBasedItems.map { attachChild(it.getNode()) }
    }

    fun Node.attachChild(nodeBased: NodeBased): Int {
        return attachChild(nodeBased.getNode())
    }

}
