package com.github.tharry.swagger.play

import play.modules.swagger.{ApiListingCache, PlayApiScanner}
import sbt.Keys._
import sbt._

object PlaySwaggerSbtPlugin extends AutoPlugin with PlaySwaggerSbtKeys{

  override lazy val projectSettings: Seq[Setting[_]] =Seq(
    targetSwaggerFilename := target.value / "swagger.yaml",
    generateSwagger := generateSwaggerTask.value
  )

  private def generateSwaggerTask = Def.task {
    println("AAAA")
    val scanner = new PlayApiScanner()
    ApiListingCache.listing("", "127.0.0.1")
    println("ZZZZ")
  }
}
