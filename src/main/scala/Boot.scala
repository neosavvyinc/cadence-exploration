import akka.actor.{Props, ActorSystem}
import akka.io.IO
import com.cadence.service.RootService
import spray.can.Http

/**
 * Created by aparrish on 7/29/14.
 */
object Boot extends App {

  implicit val system = ActorSystem("on-spray-can")

  val cadenceService = getActor

  implicit val executor = scala.concurrent.ExecutionContext.Implicits.global

  IO(Http) ! Http.Bind(cadenceService, interface = "0.0.0.0", port = Configuration.portHttp)

  private def getActor = {
    system.actorOf(Props(new Cadence), "service")
  }
}


object Configuration {
  import com.typesafe.config.ConfigFactory

  private val config = ConfigFactory.load
  config.checkValid(ConfigFactory.defaultReference)

  val host = config.getString("cadence-server.host")
  val portHttp = config.getInt("cadence-server.ports.http")
  val portTcp  = config.getInt("cadence-server.ports.tcp")
  val portWs   = config.getInt("cadence-server.ports.ws")
}

