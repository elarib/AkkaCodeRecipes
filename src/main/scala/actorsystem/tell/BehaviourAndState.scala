package actorsystem.tell

import akka.actor.{ActorSystem, Props}

object BehaviourAndState extends App{

  val actorSystem = ActorSystem("HelloAkka")


  val actor = actorSystem.actorOf(props = Props(classOf[SummingActor], 10), name ="summingActor")


  println(actorSystem)

  println(actor.path)
  println(actor.toString())

  while (true) {
    Thread.sleep(3000)
    actor ! 1
  }


}
