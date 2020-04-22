import de.fayard.dependencies.bootstrapRefreshVersionsAndDependencies

rootProject.name = "devops-introduction"

buildscript {
    repositories { gradlePluginPortal() }
    dependencies.classpath("de.fayard:dependencies:+")
}

bootstrapRefreshVersionsAndDependencies()
