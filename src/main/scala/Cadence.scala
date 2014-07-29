/**
 * Created by aparrish on 7/29/14.
 */

import akka.actor.{ ActorRef, Actor }
import com.cadence.service.CadenceEndpoint

class Cadence extends Actor with CadenceEndpoint {

  def actorRefFactory = context

  def receive = runRoute( cadenceRoute )

}
