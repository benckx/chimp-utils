package be.encelade.chimp.tpf

interface TpfAccumulable : TpfReceiver {

    val tpfAccumulator: TpfAccumulator

    override fun simpleUpdate(tpf: Float) {
        tpfAccumulator.simpleUpdate(tpf)
    }
}
