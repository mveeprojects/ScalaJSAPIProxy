package com.example.playscalajs.shared

import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax.EncoderOps

case class Location(lat: Double, long: Double)

case class Resident(name: String, age: Int, role: Option[String]) {
  private def getRole: String = role match {
    case Some(role) => role
    case None => "Null/None"
  }
  override def toString: String =
    s"name: $name\nage: $age\nrole: $getRole"
}

case class DownstreamAPIResponse(name: String, location: Location, residents: List[Resident]) {
  override def toString: String =
    s"name: $name,\nlocation: ${location.lat},${location.long},\nresidents: ${residents.map(_.toString)}"
}

object DownstreamAPIResponse {
  private val jsonString: String = """
        {
          "name" : "Watership Down",
          "location" : {
            "lat" : 51.235685,
            "long" : -1.309197
          },
          "residents" : [ {
            "name" : "Fiver",
            "age" : 4,
            "role" : null
          }, {
            "name" : "Bigwig",
            "age" : 6,
            "role" : "Owsla"
          } ]
        }
    """.stripMargin

  val jsonStringResult: String = decode[DownstreamAPIResponse](jsonString) match {
    case Right(result) => result.toString
    case Left(error) => throw new RuntimeException(error.getMessage)
  }
}

//object Main extends App {
//  val result = DownstreamAPIResponse.jsonStringResult
//  println(result)
//}