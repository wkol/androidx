/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
    id("org.jetbrains.kotlin.android")
    id("com.android.library")
}

dependencies {
//    implementation("org.jetbrains.kotlin:kotlin-stdlib-common:1.8.21")
    api("androidx.compose.animation:animation:1.4.3")
    api("androidx.compose.runtime:runtime:1.4.3")
    api("androidx.compose.ui:ui:1.4.3")
    implementation("androidx.compose.ui:ui-text:1.4.3")
    implementation("androidx.compose.ui:ui-util:1.4.3")
    implementation("androidx.compose.ui:ui-graphics:1.4.3")
    implementation("androidx.compose.foundation:foundation-layout:1.4.3")
    api("androidx.annotation:annotation:1.1.0")
    implementation("androidx.emoji2:emoji2:1.3.0")
    implementation("androidx.core:core:1.11.0-beta02")
}

//kotlin {
//    jvm()
//    android()
//
//    sourceSets {
//        val commonMain by getting {
//            dependencies {
//                implementation("org.jetbrains.kotlin:kotlin-stdlib-common:1.8.21")
//                api("androidx.compose.animation:animation:1.4.3")
//                api("androidx.compose.runtime:runtime:1.4.3")
//                api("androidx.compose.ui:ui:1.4.3")
//                implementation("androidx.compose.ui:ui-text:1.4.3")
//                implementation("androidx.compose.ui:ui-util:1.4.3")
//                implementation("androidx.compose.foundation:foundation-layout:1.4.3")
//            }
//        }
//
//
//        val jvmMain by getting {
//            dependsOn(commonMain)
//            dependencies {
//
//            }
//        }
//
//        val androidMain by getting {
//            dependsOn(jvmMain)
//            dependencies {
//                api("androidx.annotation:annotation:1.1.0")
//                implementation("androidx.emoji2:emoji2:1.3.0")
//                implementation("androidx.core:core:1.11.0-beta02")
//            }
//        }
//
//        val desktopMain by creating {
//            dependsOn(jvmMain)
//            dependencies {
//                implementation("org.jetbrains.kotlin:kotlin-stdlib")
//                implementation("androidx.compose.ui:ui-util:1.4.3")
//            }
//        }
//    }
//}

android {
    namespace = "androidx.compose.custom"
    compileSdk = 33
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }
    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        freeCompilerArgs += listOf("-Xjvm-default=all")
    }
}
