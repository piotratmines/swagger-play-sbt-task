lazy val root = (project in file("."))
  .enablePlugins(PlayScala, PlaySwaggerSbtPlugin)
  .settings(
    scalaVersion := "2.12.10",
    version := "0.1"
  )

libraryDependencies += guice
libraryDependencies += "io.swagger" %% "swagger-play2" % "1.6.0"