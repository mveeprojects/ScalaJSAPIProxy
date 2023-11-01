package com.example.playscalajs.controllers

import play.api.mvc._

import javax.inject._

@Singleton
class GreetingController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def hello(name: String, trueOrFalse: Boolean): Action[AnyContent] = Action {
    Ok(s"name: $name, tof $trueOrFalse")
  }

}