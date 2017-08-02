package actorsystem.controlaware

import akka.actor.Actor

class Logger extends Actor{

  override def receive: Receive = {
    case MyControlMessage =>
      println("Oh, i have to process Control Message First !!!")
    case x => println(x.toString)
  }

}
