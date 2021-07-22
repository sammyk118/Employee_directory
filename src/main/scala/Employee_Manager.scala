  import scala.io.StdIn.readLine

object EmployeeTracker extends App {

  def main() {
    start()
  }
  def start() {
    print("What would you like to do?  " + '\n' + "Your options are: \n" + "==== read \n" + "==== write \n" + "==== overwrite \n" + "==== exit \n")
    val command = readLine()

    if (command == "read"){
      CSV.read()
      start()
    }
    if (command == "write"){
      println("Please enter the employee's Name: ")
      val empName = readLine()
      println("\nPlease enter the employee's Department: ")
      val empDept = readLine()
      println("\nPlease enter the employee's Role: ")
      val empRole = readLine()
      println("\nPlease enter an employee ID: ")
      val empID = readLine()

      val ins: Array[String]  = Array(empName, empDept, empRole, empID)
      CSV.insert(ins)
      start()
    }
    if (command == "overwrite"){
      CSV.overWrite()
      start()
    }
    if (command == "exit"){
      println("exiting")
      exit()
    }
    else {
      println("invalid command entered, please try again")
      start()
    }

  }
  def exit(){System.exit(0)}
  main()
}

//switch function - modify an entry by extracting it by index, then using index to modify specific entries - name role etc
