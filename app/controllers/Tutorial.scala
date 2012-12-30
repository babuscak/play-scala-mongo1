package controllers
import play.api.mvc.Controller
import play.api.mvc.Action
import models.SaveData

object Tutorial extends Controller {

def testMethodForPlayTutorial = Action { implicit request =>
SaveData.saveTheDataInMongo
Ok("Data stored.")
}
}

