import scala.io.StdIn.readLine

object EmployeeTracker extends App {
  def main() {
    println("main func")
  }
  def start() {
    print("What would you like to do?")
    val command = readLine()
  }
  println(s"Your command is $command")
  if (command == "new") {
    println("call a class")
    val p = new Employee(1, "John")
  }

}

//OOP employee directory with an employee class
// dictionary of objects
