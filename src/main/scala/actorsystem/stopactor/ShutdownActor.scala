package actorsystem.stopactor

import akka.actor.Actor

class ShutdownActor extends Actor{

  override def receive: Receive = {
    case msg: String => println(msg)
    case Stop  =>
      context.stop(self)  // Used for Ordered Shutdown
      //or
      // self ! PoisonPill   // It's inbuilt Message handled after all the messages

  }

}
