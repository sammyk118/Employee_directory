  import scala.io.StdIn.readLine

object EmployeeTracker extends App {

  def main() {
    println("main func")
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
      CSV.write()
      start()
    }
    if (command == "exit"){
      println("exiting")
    }

  }
  main()
}

//OOP employee directory with an employee class
// dictionary of objects
//object setter function
// company budget, changing employee's pay changes budget
