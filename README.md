<a href="https://paypal.me/benckx/2">
<img src="https://img.shields.io/badge/Donate-PayPal-green.svg"/>
</a>

# About

A collection of Kotlin API / helpers / facades for jMonkeyEngine3, that I developed
while working on my game *Everybody Loves Bricks*: 

* https://benckx.itch.io/elb
* https://www.youtube.com/watch?v=Tm6QexsctfQ
* https://www.youtube.com/watch?v=qzs6Z_jM6mE

Although Kotlin-based, it can be re-used from a Java only project. 

# Features

## ColorRGBA

Create a `ColorRGBA` in hexadecimal:

```kotlin
    override fun simpleInitApp() {
        viewPort.backgroundColor = ColorRGBA("#1c3064")
    }
```

or with 255-based int values:

```kotlin
    override fun simpleInitApp() {
        viewPort.backgroundColor = ColorRGBA(155, 164, 193)
    }
``` 

## Vector Operators

```kotlin
    import be.encelade.chimp.utils.VectorOperatorUtils.plus

    // ...
    val v1 = Vector3f(2f, 1f, 1f)
    val v2 = Vector3f(4f, 4f, 4f)

    // prints (6.0, 5.0, 5.0)
    println(v1 + v2)
```

## Material

### Example: Unshaded Material

```kotlin
    override fun simpleInitApp() {
        // do this at init 
        MaterialDefinitions.load(assetManager) 
        
        // creating a material with a more simple API
        val floorMat = UnshadedMaterial()
        floorMat.setColor(ColorRGBA(155, 164, 193))

        val floor = Geometry("FLOOR", Box(10f, 10f, 10f))
        floor.material = floorMat
    }
```

### Example: Lighting Material

```kotlin
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

    private fun addLighting() {
        val decorLight = DirectionalLight()
        decorLight.direction = Vector3f(-1f, 1f, -2f).normalizeLocal()
        decorLight.color = ColorRGBA.White
        rootNode.addLight(decorLight)
    }
```

## Tpf Accumulator

The Tpf Accumulator is a mechanism to run actions (i.e. callback) periodically at a certain frequency (e.g. 2 Hz), 
based on the accumulated tpf being received from the engine.

It is designed for periodic actions that don't need to run as often as tpf updates (with can easily be in the 200 Hz range), 
in order to create timers-liked behavior within the main engine thread.

It can be used for example to trigger a refresh on the UI, update game state or implement cycle-based game entities 
(e.g. a machine that outputs a product every 1 sec. in a Factorio-like game). 

### Example: Run something every 2 seconds:

```kotlin
class DemoSimpleApp : SimpleApplication() {

    private val tpfAccumulator = TpfAccumulator(.5f) { tpf ->
        val fps = (1 / tpf).toInt()
        println("[${DateTime.now()}] running at $fps FPS")
    }

    override fun simpleUpdate(tpf: Float) {
        tpfAccumulator.simpleUpdate(tpf)
    }
}
```

```
[2020-11-28T12:29:18.940+01:00] running at 282 FPS
[2020-11-28T12:29:20.939+01:00] running at 307 FPS
[2020-11-28T12:29:22.937+01:00] running at 298 FPS
[2020-11-28T12:29:24.936+01:00] running at 222 FPS
[2020-11-28T12:29:26.937+01:00] running at 287 FPS
[2020-11-28T12:29:28.938+01:00] running at 220 FPS
``` 

# Samples / Examples
* Use Material and ColorRGBA:
https://github.com/benckx/ouistiti/tree/master/src/test/kotlin

# Import with Gradle

```groovy
    repositories {
        maven { url "https://jitpack.io" }
    }

    // no required, but helps for consistency
    def chimpUtilsVersion = "1.3"
    
    dependencies {
        compile "com.github.benckx.chimp-utils:chimp-utils-basics:$chimpUtilsVersion"
        compile "com.github.benckx.chimp-utils:chimp-utils-jme3:$chimpUtilsVersion"
    }
```

# Project Structure

* `chimp-utils-basics` does not have any dependency to jme3. If you split your game logic from your rendering logic, i.e. if you 
split your game into a "game logic" module (with no dependency to jme3) and a "engine render" module, then this library can
be used in your game logic module, without no requirement to link to any jme3 dependencies.  
* `chimp-utils-jme3` contains the APIs that depend on jme3 (the core package).

# Related Project

* A basic camera system for management game:<br/>
https://github.com/benckx/ouistiti

If I manage to extract re-usable management game features from my game, I would move them to the `ouistiti` project,
while more generic / engine-related components would be added here in the `chimp-utils` project.
