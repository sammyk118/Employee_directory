  import scala.io.StdIn.readLine

object EmployeeTracker extends App {

  def main() {
    start()
  }
  def start() {
    print("What would you like to do?  " + '\n' + "Your options are: \n" + "==== read \n" + "==== write \n" + "==== exit \n")
    val command = readLine()

    if (command == "read"){
      CSV.read()
      start()
    }
    if (command == "write"){
      println("Please enter an employee ID: ")
      val command = readLine()
      val ins: Array[String]  = Array("Timothy Gregory", "Accounting", "Manager", command)
      CSV.insert(ins)
      start()
    }
    if (command == "exit"){
      println("exiting")
    }

  }
  main()
}

//switch function - modify an entry by extracting it by index, then using index to modify specific entries - name role etc
