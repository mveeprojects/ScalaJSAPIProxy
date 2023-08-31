import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import sbt.{Def, _}

object Dependencies {

  object Versions {
    val scalaJsScripts = "1.2.0"
    val scalaJsDom     = "1.1.0"
    val circe          = "0.14.5"
  }

  val scalaJsScripts = "com.vmunier" %% "scalajs-scripts" % Versions.scalaJsScripts
  val scalaJsDom     = Def.setting("org.scala-js" %%% "scalajs-dom" % Versions.scalaJsDom)
  val circeCore      = Def.setting("io.circe" %%% "circe-core" % Versions.circe)
  val circeGeneric   = Def.setting("io.circe" %%% "circe-generic" % Versions.circe)
  val circeParser    = Def.setting("io.circe" %%% "circe-parser" % Versions.circe)
}
