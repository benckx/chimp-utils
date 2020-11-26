<a href="https://paypal.me/benckx/2">
<img src="https://img.shields.io/badge/Donate-PayPal-green.svg"/>
</a>

# About

A collection of Kotlin helpers for jMonkeyEngine3 that I made
while working on my game *Everybody Loves Bricks*: 

* https://benckx.itch.io/elb
* https://www.youtube.com/watch?v=Tm6QexsctfQ
* https://www.youtube.com/watch?v=qzs6Z_jM6mE

# Import with Gradle

* Configure jitpack in your repositories 

```groovy
    repositories {
        maven { url "https://jitpack.io" }
    }

    // no required, but helps for consistency
    def chimpUtilsVersion = "1.1"
    
    dependencies {
        compile "com.github.benckx.chimp-utils:chimp-utils-basics:$chimpUtilsVersion"
        compile "com.github.benckx.chimp-utils:chimp-utils-jme3:$chimpUtilsVersion"
    }
```
