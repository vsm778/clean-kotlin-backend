plugins {
    id("kotlin-base")
}

kotlin {
    explicitApi()
}

java {
    withSourcesJar()
}

tasks.withType<Jar>().configureEach {
    isReproducibleFileOrder = true
    isPreserveFileTimestamps = false
}