package actorsystem.becomeunbecomebehavior

import akka.actor.Actor

class BecomeUnbecomeActor extends Actor{

  override def receive: Receive = {
    case true => context.become(isStateTrue)
    case false => context.become(isStateFalse)
    case _ => println("don't know what you want to say !!")
  }


  def isStateTrue: Receive = {
    case msg : String => println(s"$msg")
    case false  => context.become(isStateFalse)
  }

  def isStateFalse: Receive = {
    case msg: Int => println(s"$msg")
    case true => context.become(isStateTrue)
  }

}
