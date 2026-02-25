plugins {
    id("kotlin-application")
}

dependencies {
    implementation(project(":adapters"))
    implementation(project(":infrastructure:http"))
    implementation(project(":infrastructure:telegram"))
    implementation(project(":infrastructure:service"))
}