package actorsystem.pingpong

import akka.actor.{ActorRef, ActorSystem, Props}
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.duration._
import scala.concurrent.Await

case class Ping(actorRef: ActorRef)
case class Pong(actorRef: ActorRef)

object GamePPApp extends App{
  implicit val timeout = Timeout(2 second)
  val actorSystem = ActorSystem("Ping-Pong")

  val gamer1 = actorSystem.actorOf(Props[GamerActor], "gamer1")

    gamer1 ! Ping(gamer1) // I tried this too


  // asking for result from actor
//  val future = (gamer1 ?  Ping)
//  Await.result(future, 2 seconds)

}
