package com.example.playscalajs

import com.example.playscalajs.shared.{DownstreamAPIResponse, SharedMessages}
import org.scalajs.dom

object ScalaJSExample {

  def main(args: Array[String]): Unit = {
    dom.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks
    dom.document.getElementById("scalaJsJson").textContent = DownstreamAPIResponse.jsonStringResult
  }
}
