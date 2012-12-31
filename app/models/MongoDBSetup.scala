package models
import com.mongodb.casbah.MongoConnection

object MongoDBSetup {
val mongoDB = MongoConnection("linus.mongohq.com","10005")("app10536040")


}
