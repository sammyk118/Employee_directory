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
      val ins: Array[String]  = Array("Timothy Gregory", "Accounting", "Manager", "1675")
      CSV.insert(ins)
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
//switch function - modify an entry by extracting it by index, then using index to modify specific entries - name role etc
