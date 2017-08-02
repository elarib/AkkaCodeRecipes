package actorsystem.controlaware

import akka.actor.{ActorSystem, Props}
import akka.dispatch.ControlMessage

case object MyControlMessage extends ControlMessage

object ControlAwareMailbox extends App {
  val actorSystem = ActorSystem("ControlAware")
  val actor =
    actorSystem.actorOf(Props[Logger].withDispatcher(
      "control-aware-dispatcher"))
  actor ! "hello"
  actor ! "how are"
  actor ! "you?"
  actor ! MyControlMessage
}