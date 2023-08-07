import Dependencies._
import sbtcrossproject.CrossPlugin.autoImport.{crossProject => sbtCrossProject}

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .aggregate(crossProjectJS, crossProjectJVM)
  .settings(
    name := "ScalaJSAPIProxy"
  )

lazy val crossProject = sbtCrossProject(JSPlatform, JVMPlatform).in(file("."))

lazy val crossProjectJVM = crossProject.jvm

lazy val crossProjectJS = crossProject.js.settings(
  libraryDependencies ++= Seq(js.scalaJsDom.value),
  crossTarget in fastOptJS := baseDirectory.value / "src/main/resources/web/scala-js"
)
