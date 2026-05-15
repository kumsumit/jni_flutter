import org.jetbrains.kotlin.gradle.dsl.JvmTarget
// The Android Gradle Plugin builds the native code with the Android NDK.

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android") version "2.3.21"
}

group = "com.github.dart_lang.jni_flutter"
version = "1.0"

repositories {
        google()
        mavenCentral()
    }

android {
    namespace ='com.github.dart_lang.jni_flutter'
    compileSdk = 37

    defaultConfig {
        minSdk = 24
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility JavaVersion.VERSION_21
    }
}
