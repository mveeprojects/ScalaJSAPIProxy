# ScalaJSAPIProxy

The idea of this project is to learn ScalaJS and eventually create an application that runs as a UI to proxy calls to an externally-hosted JSON API, and then render the results of this (JSON) to the user.

## JVM

Execute code using the below
```shell
sbt "project crossProjectJVM" run
```

## JS

Generate JS in `js/src/main/resources/web/scala-js` using the below
```shell
sbt fastOptJS
```

### Sources:
* [ScalaJS Plugin](https://www.scala-js.org/doc/project/)
* [CrossProject Plugin](https://github.com/portable-scala/sbt-crossproject)
* [Knoldus blog - intro to Scala JS](https://blog.knoldus.com/introduction-to-scala-js/)
