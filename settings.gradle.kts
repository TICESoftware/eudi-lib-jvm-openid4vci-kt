plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version ("0.6.0")
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        maven {
            url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
            mavenContent { snapshotsOnly() }
        }
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "eudi-lib-jvm-openid4vci-kt"