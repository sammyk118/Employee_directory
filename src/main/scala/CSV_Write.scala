object CSV {
  val empPath = "C:/Users/sammy/Documents/Revachol/Employee_directory/src/main/scala/employees.csv"
  def innerTest() {
    val bufferedSource = scala.io.Source.fromFile(s"$empPath")
    for(line <- bufferedSource.getLines){
        val cols = line.split(",").map(_.trim)
        println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}")
    }
    bufferedSource.close
  }
}
