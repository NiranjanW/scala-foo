scalaVersion := "2.13.12"
organization := "com.nakisa"
name := "nakisa"
version := "0.1.0"

lazy val hello = (project in file("."))
    .settings(
        libraryDependencies ++=Seq(
            "org.scalameta" %% "munit" % "0.7.29" % Test,
            "com.softwaremill.sttp.client4" %% "core" % "4.0.0-M8",
            "com.michaelpollmeier" %% "scala-arm" % "2.1"
    )
    )