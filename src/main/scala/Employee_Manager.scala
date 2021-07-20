  import scala.io.StdIn.readLine

object EmployeeTracker extends App {

  def main() {
    println("main func")
    CSV.innerTest()
  }
  def start() {
    print("What would you like to do?  ")
    val command = readLine()

    if (command == "new"){
      var employee = new Employee()
      employee.set_name()
      employee.read_emp()
    }

  }
  main()
}

//OOP employee directory with an employee class
// dictionary of objects
//object setter function
// company budget, changing employee's pay changes budget
