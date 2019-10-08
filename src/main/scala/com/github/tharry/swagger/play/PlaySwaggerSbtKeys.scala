package com.github.tharry.swagger.play

import sbt._

trait PlaySwaggerSbtKeys {
  lazy val targetSwaggerFilename = settingKey[File]("Target filename to generate swagger to")
  lazy val generateSwagger = taskKey[Unit]("Generate swagger for the play based service")
}
