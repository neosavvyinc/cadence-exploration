import spray.httpx.SprayJsonSupport
import spray.routing.HttpService
import spray.http.MediaTypes._

/**
 * Created by aparrish on 7/29/14.
 */
trait CadenceEndpoint extends HttpService
     with SprayJsonSupport {

  def simpleHello = pathPrefix("hello") {
    get {
      respondWithMediaType(`application/json`)
          complete("Hello from Spray!")
      }
    }

  val cadenceRoute = simpleHello
}
