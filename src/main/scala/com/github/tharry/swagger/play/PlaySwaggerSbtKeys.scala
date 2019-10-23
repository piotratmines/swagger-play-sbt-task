package com.github.tharry.swagger.play

import sbt._

trait PlaySwaggerSbtKeys {
  lazy val generateSwaggerTargetSwaggerFilename = settingKey[File]("Target filename to generate swagger to")
  lazy val generateSwagger = taskKey[Unit]("Generate swagger for the play based service")
  lazy val generateSwaggerPlayConfig = settingKey[com.typesafe.config.Config]("Configuration to use when constructing fake app")
}
