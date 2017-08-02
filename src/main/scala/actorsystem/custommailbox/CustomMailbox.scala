package actorsystem.custommailbox

import akka.actor.{ActorSystem, Props}

object CustomMailbox extends App  {
  val actorSystem = ActorSystem("HelloAkka")
  val actor =
    actorSystem.actorOf(Props[MySpecialActor].withDispatcher
    ("custom-dispatcher"))
  val actor1 = actorSystem.actorOf(Props[MyActor],"xyz")
  val actor2 =
    actorSystem.actorOf(Props[MyActor],"MyActor")
  actor1 !  ("hello", actor)
  actor2 !  ("hello", actor)
}