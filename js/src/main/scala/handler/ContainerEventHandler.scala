package handler

import css.classes._
import logger.Logger
import org.scalajs.dom._

import scala.scalajs.js.annotation.JSExportTopLevel

object ContainerEventHandler {

  @JSExportTopLevel("handleContainerButtonClickEvent")
  def handleButtonClickEvent(): Unit = {
    val bodyClassList = document.querySelector("body").classList
    bodyClassList.toggle(LINER_GRADIENT_DESIGN_BOTTOM_LEFT)
    bodyClassList.toggle(LINER_GRADIENT_DESIGN_TOP_RIGHT)
    Logger.info("Gradient designed changed")
  }
}
