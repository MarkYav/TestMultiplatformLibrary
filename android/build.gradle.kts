plugins {
    id("org.jetbrains.compose")
    id("com.android.application")
    kotlin("android")
}

group = "io.github.markyav"
version = "1.0.0"

repositories {
    jcenter()
}

dependencies {
    implementation(project(":box"))
    implementation("androidx.activity:activity-compose:1.5.0")
}

android {
    compileSdkVersion(33)
    defaultConfig {
        applicationId = "io.github.markyav.android"
        minSdkVersion(24)
        targetSdkVersion(33)
        versionCode = 1
        versionName = "1.0.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}