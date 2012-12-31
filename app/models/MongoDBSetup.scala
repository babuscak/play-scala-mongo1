package models
import com.mongodb.casbah.MongoConnection

object MongoDBSetup {
val mongoDB = MongoConnection("linus.mongohq.com",10005)("app10536040")
if (!mongoDB.authenticate("roman", "roman")) throw new Exception("No authorization in mongoDb")
        else mongoDB

}
