plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")

    implementation("com.google.guava:guava:32.1.3-jre")
}

application {
    mainClass.set("javase11.cert.App")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
