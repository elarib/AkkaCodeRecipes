package actorsystem.becomeunbecomebehavior

import akka.actor.{ActorSystem, Props}

object BecomeUnBecomeApp extends App {
  val actorSystem = ActorSystem("BecomeUnbecomeActor")
  val becomeUnBecome =
    actorSystem.actorOf(Props[BecomeUnbecomeActor])
  becomeUnBecome ! true
  becomeUnBecome ! "Hello how are you?"
  becomeUnBecome ! false
  becomeUnBecome ! 1100
  becomeUnBecome ! true
  becomeUnBecome ! "What do u do?"
}