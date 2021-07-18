class Employee (empID: Int, var firstName: String, var lastName: String, salary: Double){
    println("class entered")
    
    def prompt(){
        def this(empID: Int, firstName: String){
            this(0, "", 0.0)
        }

        def this(){
            this(0)
        }

        println("What's your employee's first and last name? ")
        val fullName = readLine()
        println(fullName)
    }
}

