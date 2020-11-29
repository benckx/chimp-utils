package be.encelade.chimp.tpf

/**
 * The tpf updates from the engine are likely to trickle down all sorts of modules. This is a simple interface to mark those.
 */
interface TpfReceiver {

    fun simpleUpdate(tpf: Float)

}
