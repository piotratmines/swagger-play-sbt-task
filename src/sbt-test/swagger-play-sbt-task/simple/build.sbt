lazy val root = (project in file("."))
  .enablePlugins(PlaySwaggerSbtPlugin)
  .settings(
    scalaVersion := "2.12.10",
    version := "0.1"
  )