import com.github.tharry.swagger.play.FakesFactory2
import com.typesafe.config.ConfigFactory
import org.scalatest._

class ExampleSpec extends FlatSpec with Matchers {

  "Fakes factory" should "create fake app" in {
    val app = FakesFactory2.fakeApplication(ConfigFactory.defaultApplication())
  }
}