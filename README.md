# ScalaJSAPIProxy

The idea of this project is to learn ScalaJS and eventually create an application that runs as a UI to proxy calls to an externally-hosted JSON API, and then render the results of this (JSON) to the user.

### Running the app

`sbt "project server" run` -> http://localhost:9000

Greeting endpoint example -> http://localhost:9000/hello/mark?trueorfalse=false

### Sources

* [Based on this Play ScalaJs Giter8](https://github.com/vmunier/play-scalajs.g8)
* [ScalaJS Plugin](https://www.scala-js.org/doc/project/)
* [CrossProject Plugin](https://github.com/portable-scala/sbt-crossproject)
* [Knoldus blog - intro to Scala JS](https://blog.knoldus.com/introduction-to-scala-js/)
