package actorsystem.communication

import akka.actor.Actor

class QueryActor extends Actor{

  import Messages._

  override def receive: Receive = {
    case Start(actorRef) =>
      println("send me the next random number")
      actorRef ! GiveMeRandomNumber
    case Done(randomNumber) =>
      println(s"received a random Number $randomNumber")

  }

}
