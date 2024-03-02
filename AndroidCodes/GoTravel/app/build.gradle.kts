plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.gotravel"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.gotravel"
        minSdk = 31
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    dataBinding{
        enable = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    // Splash Screen
    implementation("androidx.core:core-splashscreen:1.0.0")

    // Hilt
    val hilt_version = "2.38.1"
    implementation("com.google.dagger:hilt-android:$hilt_version")

    // Feature module Support
    implementation ("androidx.navigation:navigation-dynamic-features-fragment:2.4.2")
    implementation ("org.jetbrains.kotlin:kotlin-reflect:1.6.10")

    // ViewModel
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1")

    // LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.4.1")

    //implementation "android.arch.lifecycle:extensions:2.2.0"
    annotationProcessor ("androidx.lifecycle:lifecycle-compiler:2.2.0")

    // Kotlin
    implementation("androidx.navigation:navigation-fragment-ktx:2.4.2")
    implementation("androidx.navigation:navigation-ui-ktx:2.4.2")
    implementation("androidx.navigation:navigation-dynamic-features-fragment:2.4.2")
    api ("androidx.navigation:navigation-fragment-ktx:2.5.0-alpha04")
    api ("androidx.navigation:navigation-ui-ktx:2.5.0-alpha04")
}