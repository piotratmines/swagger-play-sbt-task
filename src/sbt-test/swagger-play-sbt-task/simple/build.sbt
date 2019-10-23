import com.typesafe.config.ConfigFactory


lazy val root = (project in file("."))
  .enablePlugins(PlayScala, PlaySwaggerSbtPlugin)
  .settings(
    scalaVersion := "2.12.10",
    version := "0.1",
    generateSwaggerPlayConfig := ConfigFactory.parseFile(new File("conf/test.conf"))
  )

libraryDependencies += guice
libraryDependencies += "io.swagger" %% "swagger-play2" % "1.6.0"
libraryDependencies += "com.github.tharry" %% "play-print-swagger" % "0.1.0" % Test


//Test / run / fork := false
