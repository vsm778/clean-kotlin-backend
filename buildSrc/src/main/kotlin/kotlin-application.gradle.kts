plugins {
    id("kotlin-base")
    application
}

application {
    mainClass = "app.AppKt"
}

tasks.withType<Jar>().configureEach {
    isReproducibleFileOrder = true
    isPreserveFileTimestamps = false
}