// import java.util.{Date, Locale}
// import java.text.SimpleDateFormat
  import scala.io.StdIn.readLine

object Employee {
    def getInfo(){
        setName()
    }

    def setName (){
        println("What's your employee's full name? ")
        var fullName = readLine()
    }
}
