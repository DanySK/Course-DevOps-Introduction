plugins {
  id("org.danilopianini.gradle-latex")
}

latex {
    "CI" {
        watching = listOf(
            "images",
            "bibliography.bib"
        ) + listOf("00-minimal", "01-dependencies", "02-multilang", "03-scalatest")
            .map { "workspace/$it" }
            .flatMap {
                listOf("$it/src", "$it/build.gradle.kts", "$it/settings.gradle.kts")
            }
    }
}
