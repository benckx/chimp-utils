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

Create an unshaded material:
```kotlin
    override fun simpleInitApp() {
        // do this at init 
        MaterialDefinitions.load(assetManager) 
        
        // simplified API:
        val floorMat = UnshadedMaterial()
        floorMat.setColor(ColorRGBA(155, 164, 193))

        val floor = Geometry("FLOOR", Box(10f, 10f, 10f))
        floor.material = floorMat
    }
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
