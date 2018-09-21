plugins {
    java
}

group = "com.gildedrose"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit:junit:4.12")
    testCompile("org.assertj:assertj-core:3.11.1")
    testCompile("com.approvaltests:approvaltests:2.0.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}