package logger

object Logger {

  def info(messages: Any*): Unit = println(messages.map(_.toString).mkString(","))
}
