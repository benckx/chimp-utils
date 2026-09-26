plugins {
    alias(libs.plugins.kotlin.jvm)
    `java-library`
}

dependencies {
    api(project(":chimp-utils-basics"))
    api(libs.jme.core)

    api(libs.kotlin.stdlib)
    api(libs.kotlin.reflect)

    testImplementation(libs.junit)
    testImplementation(libs.jme.desktop)
    testImplementation(libs.jme.lwjgl3)
    testImplementation(libs.jme.plugins)
    testImplementation(libs.jme.jogg)
}

tasks.test {
    failOnNoDiscoveredTests = false
}
