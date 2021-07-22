object CSV {
  // import java.io.{BufferedWriter, FileWriter}
  import java.io.{PrintWriter, File}
  import au.com.bytecode.opencsv.CSVWriter
  import scala.collection.JavaConversions._
  import scala.collection.mutable.ListBuffer
  import scala.collection.mutable.ArrayBuffer

  val empPath = "./src/main/scala/employees.csv"
  // Schema: emp_name, emp_dept, emp_role, emp_id

  def read(): ListBuffer[Array[String]] = { //read makes an array out of each line in the CSV, then creates a list of arrays
    val bufferedSource = scala.io.Source.fromFile(s"$empPath")
    var data = ListBuffer[Array[String]]()
    for (line <- bufferedSource.getLines) {
      val cols =
        line.split(",").map(_.trim) //split entries by comma, trim whitespace
      val arr = Array[String](
        cols(0),
        cols(1),
        cols(2),
        cols(3)
      )
      data += arr
    }
    print(data) //print file contents
    bufferedSource.close
    return data
  }

  def write(curr: ListBuffer[Array[String]]) {
    // val out = new BufferedWriter(new FileWriter(empPath))
    // val writer = new CSVWriter(out)
    val out = new PrintWriter(new File(empPath))
    val rawData = parse(curr)

    out.write(rawData)
    // writer.writeAll(curr)
    // println("file written")
    out.close()
  }

  def parse(data: ListBuffer[Array[String]]): String = {
    var rawData:String = ""
    for (element <- data){
      rawData += element.mkString(",")
      rawData += "\n"
    }
    return rawData
  }

  def insert(input: Array[String]) { //insert takes current CSV file, appends new entry, then passes to write
    println("INSERTING INTO CSV: " + input.mkString)

    val curr = read()
    // var idArr = ArrayBuffer()
    // for(element <- curr){
    //   println(element(3))
    //   // idArr += element(3).toInt
    // }
    // println(idArr)
    curr += input
    write(curr)
    }

  def print(data: ListBuffer[Array[String]]) { //parse prints entries in a neatish fashion
    println("\nParsed Out: ")
    for (element <- data)
      println(
        "Name: " +
          element(0) +
          "\nDepartment: " +
          element(1) +
          "\nRole: " +
          element(2) +
          "\nID: " +
          element(3) +
          "\nEND OF ENTRY\n"
      )
  }

  def overWrite(){
    val out = read()
    write(out)
    read()
  }
}
//to insert: read, take the output, append new array to the list, overwrite file
//csv pattern: 1, 3, 6, 15, 31