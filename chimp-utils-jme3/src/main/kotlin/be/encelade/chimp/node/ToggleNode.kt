package be.encelade.chimp.node

import be.encelade.chimp.tpf.TpfAccumulable
import be.encelade.chimp.tpf.TpfAccumulator

/**
 * [com.jme3.scene.Node] that can be toggled (show/hide) and refreshed on regular basis (e.g. every 2 sec. if refreshFrequency = .5f)
 * <br/>Was designed mainly for UI elements but can in principle be used for other stuff.
 */
abstract class ToggleNode(private val nodeName: String,
                          private val afterShowed: () -> Unit = {},
                          private val afterClosed: () -> Unit = {},
                          refreshFrequency: Float = DEFAULT_REFRESH_RATE) :
        NodeBased(nodeName), TpfAccumulable {

    private var isVisible = false

    override val tpfAccumulator = TpfAccumulator(refreshFrequency) {
        if (isVisible) {
            refreshContent()
        }
    }

    protected abstract fun render()

    fun isVisible() = isVisible

    fun toggle() {
        if (isVisible) {
            hide()
        } else {
            show()
        }
    }

    fun hide() {
        if (isVisible) {
            detachAllChildren()
            isVisible = false
            afterClosed()
        }
    }

    fun show() {
        if (!isVisible) {
            detachAllChildren()
            render()
            refreshContent()
            afterRender()
            isVisible = true
            afterShowed()
        }
    }

    protected open fun afterRender() {}

    protected open fun refreshContent() {}

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ToggleNode

        if (nodeName != other.nodeName) return false

        return true
    }

    override fun hashCode(): Int {
        return nodeName.hashCode()
    }

    companion object {

        const val DEFAULT_REFRESH_RATE: Float = 2f

    }
}
