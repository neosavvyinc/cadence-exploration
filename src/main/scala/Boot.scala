import akka.actor.{Props, ActorSystem}
import akka.io.IO
import spray.can.Http

/**
 * Created by aparrish on 7/29/14.
 */
object Boot extends App {

  implicit val system = ActorSystem("on-spray-can")

  val cadenceService = getActor

  implicit val executor = scala.concurrent.ExecutionContext.Implicits.global

  IO(Http) ! Http.Bind(cadenceService, interface = "0.0.0.0", port = 9090)

  private def getActor = {
    system.actorOf(Props(new Cadence), "service")
  }

}
