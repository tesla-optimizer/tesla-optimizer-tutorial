import sbt.project

import java.util.Locale

name := "tesla-optimizer-tutorial"
version := "0.1"
scalaVersion := "2.13.7"


lazy val french = (project in file("french"))
  .enablePlugins(ParadoxMaterialThemePlugin, ParadoxPlugin, ParadoxSitePlugin)
  .settings(
    Compile / paradoxProperties  ++= Map(
      "image.base_url" -> ".../assets",
      "project.description" -> "Guide de montage d'un système d'optimisation de charge en continu pour véhicules Tesla",
      "project.title" -> "Tesla optimizer",
      "project.image" -> "https://tesla-optimizer.github.io/assets/logo.svg"
    ),
    Compile / paradoxMaterialTheme := {
      val theme = (Compile / paradoxMaterialTheme).value
      val repository = uri("https://github.com/tesla-optimizer/tesla-optimizer-tutorial")
      theme
        .withRepository(repository)
        .withFont("Overpass", "Overpass Mono")
        .withLogo("assets/logo-symbol-only.svg")
        .withFavicon("assets/favicon.png")
        .withSocial(repository)
        .withCopyright("Tesla-optimizer contributors")
        .withLanguage(Locale.FRENCH)
        .withColor("light green", "light green")
        .withGoogleAnalytics("")
    }
  )