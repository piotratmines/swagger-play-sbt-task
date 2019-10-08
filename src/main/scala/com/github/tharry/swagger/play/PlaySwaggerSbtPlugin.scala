package com.github.tharry.swagger.play

import sbt.Keys._
import sbt._

object PlaySwaggerSbtPlugin extends AutoPlugin with PlaySwaggerSbtKeys{

  override lazy val projectSettings: Seq[Setting[_]] =Seq(
    targetSwaggerFilename := target.value / "swagger.yaml",
    generateSwagger := generateSwaggerTask.value
  )

  private def generateSwaggerTask = Def.task {
    println("AAAA")
  }
}
