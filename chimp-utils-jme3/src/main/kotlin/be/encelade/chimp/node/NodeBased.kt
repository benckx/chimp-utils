package be.encelade.chimp.node

import com.jme3.scene.Node
import com.jme3.scene.Spatial

// FIXME: is it actually useful? is there an added value compared to simply extend Node?
abstract class NodeBased(nodeName: String) {

    protected val objectNode: Node = Node(nodeName)

    protected fun detachAllChildren() = objectNode.detachAllChildren()

    protected fun detachChildNamed(name: String) = objectNode.detachChildNamed(name)

    protected fun detachChild(nodeBased: NodeBased) = detachChildNamed(nodeBased.objectNode.name)

    protected fun detachChild(name: String) = objectNode.detachChildNamed(name)

    protected fun detachChild(spatial: Spatial) = objectNode.detachChild(spatial)

    protected fun detachChild(node: Node) = objectNode.detachChild(node)

    protected fun attachChild(child: Spatial) = objectNode.attachChild(child)

    protected fun attachChild(nodeBased: NodeBased) = objectNode.attachChild(nodeBased.getNode())

    fun getNode(): Node = objectNode

}
