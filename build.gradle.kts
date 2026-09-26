plugins {
    alias(libs.plugins.versions)
    alias(libs.plugins.kotlin.jvm) apply false
}

allprojects {
    group = rootProject.group
    version = rootProject.version

    repositories {
        google()
        mavenCentral()
    }
}
