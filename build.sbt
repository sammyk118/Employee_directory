name := "EmployeeManagement"
version := "0.1"
scalaVersion := "2.12.14"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.3"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.3"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.4.3"

trapExit := false