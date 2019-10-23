lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "swagger-play-sbt-task",
    version := "0.1.0",
    organization := "com.github.tharry",
    scalaVersion := "2.12.10",
    sbtPlugin := true,
    sbtVersion := "1.3.2",
    scriptedLaunchOpts := { scriptedLaunchOpts.value ++
      Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
    },
    scriptedBufferLog := false
  )

libraryDependencies += "com.typesafe.play" %% "play-guice" % "2.6.20"
libraryDependencies += "io.swagger" %% "swagger-play2" % "1.6.0"
libraryDependencies += "com.typesafe.play" %% "play-jdbc-api" % "2.6.20"
libraryDependencies += "com.typesafe.play" %% "play-jdbc" % "2.6.20"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"
