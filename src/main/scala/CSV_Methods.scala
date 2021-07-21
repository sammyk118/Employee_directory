object CSV {
  import java.io.{BufferedWriter, FileWriter}
  import au.com.bytecode.opencsv.CSVWriter
  import scala.collection.JavaConversions._
  import scala.collection.mutable.ListBuffer

  val empPath = "./src/main/scala/employees.csv"
  // Schema: emp_name, emp_dept, emp_role, emp_id

  def read(): ListBuffer[Array[String]] = {
    val bufferedSource = scala.io.Source.fromFile(s"$empPath")
    var data = ListBuffer[Array[String]]()
    for (line <- bufferedSource.getLines) {
      val cols = line.split(",").map(_.trim) //split entries by comma, trim whitespace
      val arr = Array[String](
        s"${cols(0)}",
        s"${cols(1)}",
        s"${cols(2)}",
        s"${cols(3)}"
      )
      println("\nArray: ", arr.mkString)
      data += arr
    }
    parse(data) //print file contents
    bufferedSource.close
    return data
  }

  def parse(data: ListBuffer[Array[String]]) {
    println("\nParsed Out: ")
    for (element <- data)
      println("Name: ", element(0), "\nDepartment: ", element(1), "\nRole: ", element(2), "\nID: ", element(3))
  }

  def write(curr: ListBuffer[Array[String]]) {
    val out = new BufferedWriter(new FileWriter(empPath))
    val writer = new CSVWriter(out)

    writer.writeAll(curr)
    println("file written")
    out.close()
  }

  def insert(input: Array[String]) {
    println("INSERTING INTO CSV: ", input.mkString)

    val curr = read()
    curr += input
    write(curr)
  }
}
//to insert: read, take the output, append new array to the list, overwrite file