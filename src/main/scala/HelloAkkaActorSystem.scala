import akka.actor.ActorSystem

object HelloAkkaActorSystem extends App{

  val actorSystem = ActorSystem("HelloAkka")


  println(actorSystem)

  println(actorSystem.child("user"))
  println(actorSystem.child("system"))

}
