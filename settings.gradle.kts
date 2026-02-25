rootProject.name = "Clean kotlin backend"

include(
    "app",
    "domain",
    "usecases",
    "adapters",
    "infrastructure:http"
)

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}