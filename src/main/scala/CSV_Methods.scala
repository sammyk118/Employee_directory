object CSV {
  import java.io.{BufferedWriter, FileWriter}
  import au.com.bytecode.opencsv.CSVWriter
  import scala.collection.JavaConversions._
  import scala.collection.mutable.ListBuffer

  val empPath =
    "C:/Users/sammy/Documents/Revachol/Employee_directory/src/main/scala/employees.csv"
  val empSchema = Array("emp_name", "emp_dept", "emp_role", "emp_id")

  def read(): ListBuffer[Map[String, String]] ={
    val bufferedSource = scala.io.Source.fromFile(s"$empPath")
    println(bufferedSource)
    var parsedOut = ListBuffer[Map[String, String]]()
    for (line <- bufferedSource.getLines) {
      val cols = line.split(",").map(_.trim)
      println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}")
      val map = Map[String, String]("Name" ->  s"${cols(0)}", "Department" ->  s"${cols(1)}", "Role" ->  s"${cols(2)}", "ID" -> s"${cols(3)}")
      parsedOut += map
    }
    println("Parsed Out: " + parsedOut)
    bufferedSource.close
    return parsedOut
  }

  def write() {
    read()
    val out = new BufferedWriter(new FileWriter(empPath))
    val writer = new CSVWriter(out)

    val entry = Array("Timothy Gregory", "Accounting", "Manager", "1675")
    val input = List(empSchema, entry)
    writer.writeAll(input)
    out.close()
  }
}
//to append: read, take the output, append new array to the list