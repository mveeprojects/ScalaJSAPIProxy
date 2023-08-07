import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import sbt._

object Dependencies {

  private object versions {
    lazy val scalaJsDom: String = "1.1.0"
  }

  object js {
    lazy val scalaJsDom = Def.setting("org.scala-js" %%% "scalajs-dom" % versions.scalaJsDom)
  }
}
