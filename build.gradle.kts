buildscript {
    dependencies {
    }
}
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.devop.ksp) apply false
    alias(libs.plugins.dagger.hilt) apply false
}