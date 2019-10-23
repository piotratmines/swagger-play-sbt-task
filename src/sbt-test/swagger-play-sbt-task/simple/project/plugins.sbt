addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.20")

sys.props.get("plugin.version") match {
  case Some(x) =>
    addSbtPlugin("com.github.tharry" % "swagger-play-sbt-task" % x)
  case _ => sys.error("""|The system property 'plugin.version' is not defined.
                         |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
}