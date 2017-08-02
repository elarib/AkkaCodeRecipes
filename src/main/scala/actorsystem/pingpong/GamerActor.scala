package actorsystem.pingpong

import akka.actor.Actor

class GamerActor extends Actor{

  override def receive: Receive = {
    case Ping(actorRef) =>
      println(s"=> Pong")
      println(actorRef)
      println(self)
      actorRef ! Pong(self)
    case Pong(actorRef) =>
      println(s"=> Ping")
      actorRef ! Ping(self)
  }

}
