plugins {
    java
    application
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("com.google.guava:guava:22.0")
    implementation("commons-io:commons-io:+")
    implementation("com.omertron:thetvdbapi:[1.6, 1.7]")
}
application {
    mainClassName = "it.unibo.ci.PrintBreakingBad" 
}
