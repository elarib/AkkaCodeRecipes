package actorsystem.communication

import akka.actor.{ActorRef, ActorSystem, Props}
import actorsystem.communication.Messages.Start

object Messages {
  case class Done(randomNumber: Int)
  case object GiveMeRandomNumber
  case class Start(actorRef: ActorRef)
}

object Communication extends App{

  val actorSystem = ActorSystem("Communication")
  val randomNumberGenerator = actorSystem.actorOf(Props[RandomNumberGeneratorActor])
  val queryActor = actorSystem.actorOf(Props[QueryActor])

  queryActor ! Start(randomNumberGenerator)

}
