package handler

import css.classes._
import logger.Logger
import org.scalajs.dom._

import scala.scalajs.js.annotation.JSExportTopLevel

object WindowEventHandler {

  @JSExportTopLevel("onLoadHandler")
  def onLoadHandler(): Unit = {
    val webPageLoadedMessage = "Web page loaded successfully."
    window.alert(webPageLoadedMessage)
    document.querySelector("#container").classList.remove(DISPLAY_NONE)
    Logger.info(webPageLoadedMessage)
  }
}
