package actorsystem.tell

import akka.actor.Actor

class SummingActor(initSum: Int) extends Actor{

  var sum = 0

  override def receive: Receive = {
    case x: Int => sum = initSum+ sum + x
      println(s"my state as sum is $sum")
    case _ => println("invalid message")
  }

}
