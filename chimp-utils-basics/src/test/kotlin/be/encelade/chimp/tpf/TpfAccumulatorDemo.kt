package be.encelade.chimp.tpf

import com.jme3.app.SimpleApplication
import com.jme3.system.AppSettings
import java.time.Instant

fun main() {
    val settings = AppSettings(true)
    settings.isFullscreen = false
    settings.isVSync = false
    settings.setResolution(1280, 720)

    val simpleApp = DemoSimpleApp()
    simpleApp.setSettings(settings)
    simpleApp.isShowSettings = false
    simpleApp.start()
}

class DemoSimpleApp : SimpleApplication() {

    private val tpfAccumulator = TpfAccumulator(.5f) { tpf ->
        val fps = (1 / tpf).toInt()
        println("[${Instant.now()}] running at $fps FPS")
    }

    override fun simpleInitApp() {
        inputManager.isCursorVisible = true
    }

    override fun simpleUpdate(tpf: Float) {
        tpfAccumulator.simpleUpdate(tpf)
    }

}
