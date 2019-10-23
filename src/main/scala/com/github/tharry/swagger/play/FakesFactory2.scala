package com.github.tharry.swagger.play

import com.typesafe.config.Config
import play.api.Configuration
import play.api.db.{Database, Databases, PooledDatabase}
import play.api.inject.bind
import play.api.inject.guice.GuiceApplicationBuilder

object FakesFactory2   {

  def fakeApplication(config: Config): play.api.Application = {
    GuiceApplicationBuilder
    new FakeApplicationBuilder()
      .loadConfig(Configuration(config.resolve()))
      .overrides(bind[Database].toInstance(inMemory()))
      .build
  }

  def inMemory(name: String = "default", urlOptions: Map[String, String] = Map.empty): Database = {
    val driver = "org.h2.Driver"
    val urlExtra = if (urlOptions.nonEmpty) urlOptions.map { case (k, v) => k + "=" + v }.mkString(";", ";", "") else ""
    val url = "jdbc:h2:mem:" + name + urlExtra
    val dbConfig = Configuration.from(Map("driver" -> driver, "url" -> url, "username" -> "", "password" -> "", "jndiName"->""))
    new PooledDatabase(name, dbConfig)
  }

}
