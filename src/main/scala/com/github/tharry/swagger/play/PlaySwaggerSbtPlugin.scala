package com.github.tharry.swagger.play

import com.github.tharry.swagger.play.PlaySwaggerSbtPlugin.generateSwagger
import com.typesafe.config.ConfigFactory
import play.api.{Configuration, Play}
import play.modules.swagger.{ApiListingCache, PlayApiScanner}
import sbt.Keys._
import sbt._
import sbt.internal.util.Attributed.data

object PlaySwaggerSbtPlugin extends AutoPlugin with PlaySwaggerSbtKeys{

  override lazy val projectSettings: Seq[Setting[_]] = Seq(
    generateSwaggerTargetSwaggerFilename := target.value / "swagger.yaml",
    generateSwaggerPlayConfig := ConfigFactory.empty(),
    //generateSwagger := generateSwaggerTask.value
    generateSwagger := (fgRunMain in Test).toTask(" com.github.tharry.play.swagger.SwaggerPrinter").value


  )

  object autoImport extends PlaySwaggerSbtKeys

//  private def generateSwaggerTask = Def.task {
//    println("AAAA")
//    println(generateSwaggerPlayConfig.value)
//    val app = FakesFactory.fakeApplication(generateSwaggerPlayConfig.value)
//    Play.start(app)
//    val scanner = new PlayApiScanner()
//    ApiListingCache.listing("", "127.0.0.1")
//    println("ZZZZ")
//  }

  //
  //sampleIntTask := (fgRunMain in Test).toTask(" com.github.tharry.swagger.play.PlaySwaggerSbtPlugin").value

  def main(args: Array[String]): Unit = {
//    import java.io._
//    val pw = new PrintWriter(new File("hello.txt" ))
//    pw.write("Hello, world")
//    pw.close
    println("AAAA")
//    val conf = ConfigFactory.parseFile(new File("conf/test.conf"))
//    println(conf)
//    val app = FakesFactory.fakeApplication(conf)
//    Play.start(app)
//    val scanner = new PlayApiScanner()
//    ApiListingCache.listing("", "127.0.0.1")
    println("ZZZZ")

  }
}
