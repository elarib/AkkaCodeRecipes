package actorsystem.communication

import akka.actor.Actor

import scala.util.Random

class RandomNumberGeneratorActor extends Actor{
  import Messages._

  override def receive: Receive = {
    case GiveMeRandomNumber =>
      println("received a message to generate a random integer")
      val randomNumber = Random.nextInt()
      sender ! Done(randomNumber)

  }


}
