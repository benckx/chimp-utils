package be.encelade.chimp.tpf

import java.time.Duration

/**
 * Mechanism to run an actions (i.e. callback) periodically at a certain frequency (e.g. 2 Hz), based on the accumulated tpf.
 * <br/>Designed for periodic actions that don't need to run as often as tpf updates.
 * <br/>Can be used to program timers scheduled within the same thread as the main game thread.
 */
class TpfAccumulator(frequencyHz: Float, private val oneShot: Boolean = false, val callback: (Float) -> Unit) : TpfReceiver {

    constructor(duration: Duration, oneShot: Boolean = true, callback: (Float) -> Unit) :
            this(1f / duration.seconds, oneShot, callback)

    val cycleDurationInSeconds: Float = 1 / frequencyHz

    private var isStopped = false
    private var tpfAccumulator = 0f

    override fun simpleUpdate(tpf: Float) {
        if (!isStopped) {
            tpfAccumulator += tpf
            if (tpfAccumulator >= cycleDurationInSeconds) {
                callback(tpf)
                if (oneShot && !isStopped) {
                    isStopped = true
                }
                tpfAccumulator -= cycleDurationInSeconds
            }
        }
    }

}
