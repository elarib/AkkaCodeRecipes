package supervisionandmonitoring.createchild

import akka.actor.Actor

class ParentActor extends Actor{

  override def receive: Receive = {
    case Greet(msg) => println(s"My parent[${self.path.parent}] greeted to me [${self.path}] $msg")

  }

}
