plugins {
    alias(libs.plugins.kotlin.jvm)
    `java-library`
}

dependencies {
    api(libs.kotlin.stdlib)
    api(libs.kotlin.reflect)

    testImplementation(libs.junit)
    testImplementation(libs.jme.core)
    testImplementation(libs.jme.desktop)
    testImplementation(libs.jme.lwjgl3)
    testImplementation(libs.jme.plugins)
    testImplementation(libs.jme.jogg)
}

tasks.test {
    failOnNoDiscoveredTests = false
}
