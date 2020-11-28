package be.encelade.chimp.material

import com.jme3.app.SimpleApplication
import com.jme3.light.DirectionalLight
import com.jme3.math.ColorRGBA
import com.jme3.math.Vector3f
import com.jme3.renderer.queue.RenderQueue
import com.jme3.scene.Geometry
import com.jme3.scene.shape.Sphere
import com.jme3.system.AppSettings
import java.awt.Color.ORANGE

fun main() {
    val settings = AppSettings(true)
    settings.isFullscreen = false
    settings.setResolution(1280, 720)

    val simpleApp = LightingMaterialDemoApp()
    simpleApp.setSettings(settings)
    simpleApp.isShowSettings = false
    simpleApp.start()
}

class LightingMaterialDemoApp : SimpleApplication() {

    override fun simpleInitApp() {
        MaterialDefinitions.load(assetManager)
        addLighting()

        val material = LightingMaterial()
        material.setColor(ORANGE)

        val geometry = Geometry("SPHERE", Sphere(15, 15, 1f))
        geometry.material = material
        geometry.shadowMode = RenderQueue.ShadowMode.CastAndReceive

        rootNode.attachChild(geometry)
    }

    override fun simpleUpdate(tpf: Float) {
    }

    private fun addLighting() {
        val decorLight = DirectionalLight()
        decorLight.direction = Vector3f(-1f, 1f, -2f).normalizeLocal()
        decorLight.color = ColorRGBA.White
        rootNode.addLight(decorLight)
    }

}
