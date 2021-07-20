// import java.util.{Date, Locale}
// import java.text.SimpleDateFormat
  import scala.io.StdIn.readLine

class Employee {
    var emp_name: String= ""
    var emp_dept: String= ""
    var emp_role: String= "" 

    def set_name (){
        println("What's your employee's full name? ")
        var fullName = readLine()
        emp_name = fullName
    }
    def read_emp(){
        println("Name: " + emp_name + "\n" + "Department:" + emp_dept + "\n" + "Role: " + emp_role)
    }
}
